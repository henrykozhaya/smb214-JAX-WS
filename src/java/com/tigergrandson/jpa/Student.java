/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tigergrandson.jpa;

/**
 *
 * @author henry_kozhaya
 */
public class Student {
    
    private String student_id;
    private String student_person_id;
    private String student_family_id;
    private String student_time_stamp;
    
    public Student(String student_id, String student_person_id, String student_family_id, String student_time_stamp) {
        this.student_id = student_id;
        this.student_person_id = student_person_id;
        this.student_family_id = student_family_id;
        this.student_time_stamp = student_time_stamp;
    }

    public Student() {
        this.student_id = null;
        this.student_person_id = null;
        this.student_family_id = null;
        this.student_time_stamp = null;        
    }

    /**
     * @return the Student_id
     */
    public String getStudent_id() {
        return student_id;
    }

    /**
     * @param student_id the Student_id to set
     */
    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    /**
     * @return the Student_person_id
     */
    public String getStudent_person_id() {
        return student_person_id;
    }

    /**
     * @param student_person_id the Student_person_id to set
     */
    public void setStudent_person_id(String student_person_id) {
        this.student_person_id = student_person_id;
    }

    /**
     * @return the Student_family_id
     */
    public String getStudent_family_id() {
        return student_family_id;
    }

    /**
     * @param student_family_id the Student_family_id to set
     */
    public void setStudent_family_id(String student_family_id) {
        this.student_family_id = student_family_id;
    }

    /**
     * @return the Student_time_stamp
     */
    public String getStudent_time_stamp() {
        return student_time_stamp;
    }

    /**
     * @param student_time_stamp the Student_time_stamp to set
     */
    public void setStudent_time_stamp(String student_time_stamp) {
        this.student_time_stamp = student_time_stamp;
    }
    
}
