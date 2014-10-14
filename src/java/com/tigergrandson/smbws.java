/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tigergrandson;

import com.tigergrandson.jpa.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author henry_kozhaya
 */
@WebService(serviceName = "smbws")
public class smbws {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getSchoolYear")
    public List<SchoolYear> getSchoolYear() {
        List<SchoolYear> SchoolYear = new ArrayList<SchoolYear>();
        try {
            String query = com.tigergrandson.lib.ReadSelect("getSchoolYear");
            ResultSet rs = com.tigergrandson.lib.exeSelect(query);
            while (rs.next()) {
                SchoolYear sy = new SchoolYear();
                sy.setSchool_year_id(rs.getString("school_year_id"));
                sy.setSchool_year_name(rs.getString("school_year_name"));
                sy.setSchool_year_start_date(rs.getString("school_year_start_date"));
                sy.setSchool_year_end_date(rs.getString("school_year_end_date"));
                sy.setSchool_year_time_stamp(rs.getString("school_year_time_stamp"));
                SchoolYear.add(sy);
                sy = null;
            }

        } catch (SQLException ex) {
            com.tigergrandson.lib.logToFile("error - " + ex.toString());
        } finally {
            return SchoolYear;
        }        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getExamList")
    public List<Exam> getExamList(@WebParam(name = "school_year_id") String school_year_id) {
        List<Exam> Exams = new ArrayList<Exam>();
        try {
            String query = com.tigergrandson.lib.ReadSelect("getExamList", school_year_id);
            ResultSet rs = com.tigergrandson.lib.exeSelect(query);
            while (rs.next()) {
                Exam ex = new Exam();
                ex.setExam_id(rs.getString("exam_id"));
                ex.setExam_name(rs.getString("exam_name"));
                ex.setExam_school_year_id(rs.getString("exam_school_year_id"));
                ex.setExam_school_time_stamp(rs.getString("exam_time_stamp"));
                Exams.add(ex);
                ex = null;
            }

        } catch (SQLException ex) {
            com.tigergrandson.lib.logToFile("error - " + ex.toString());
        } finally {
            return Exams;
        } 
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getStudentClassCourse")
    public List<String> getStudentClassCourse(@WebParam(name = "student_id") String student_id) {
       List<String> courses = new ArrayList<String>();
        try {
            String query = com.tigergrandson.lib.ReadSelect("getStudentClassCourse", student_id);
            ResultSet rs = com.tigergrandson.lib.exeSelect(query);
            while (rs.next()) {
                Double note_max = Double.parseDouble(rs.getString("class_course_coefficient"));
                note_max = note_max * 20;
                courses.add(rs.getString("course_name")+" <b>("+String.valueOf(note_max)+")</b>");
            }

        } catch (SQLException ex) {
            com.tigergrandson.lib.logToFile("error - " + ex.toString());
        } finally {
            return courses;
        } 
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getStudentExamGrades")
    public List<String> getStudentExamGrades(@WebParam(name = "student_id") String student_id, @WebParam(name = "exam_id") String exam_id) {
       List<String> grades = new ArrayList<String>();
        try {
            String query = com.tigergrandson.lib.ReadSelect("getStudentExamGrades", student_id, exam_id);
            ResultSet rs = com.tigergrandson.lib.exeSelect(query);
            while (rs.next()) {
                Double note = Double.parseDouble(rs.getString("grade_value")) * Double.parseDouble(rs.getString("class_course_coefficient"));
                grades.add(String.valueOf(note));
            }

        } catch (SQLException ex) {
            com.tigergrandson.lib.logToFile("error - " + ex.toString());
        } finally {
            return grades;
        } 

    }
}
