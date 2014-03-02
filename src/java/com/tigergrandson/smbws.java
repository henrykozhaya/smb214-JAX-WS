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
}
