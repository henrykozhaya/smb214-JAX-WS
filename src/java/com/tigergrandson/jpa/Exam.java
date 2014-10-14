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
public class Exam {
    private String exam_id;
    private String exam_name;
    private String exam_school_year_id;
    private String exam_school_time_stamp;

    public Exam() {
        this.exam_id = null;
        this.exam_name = null;
        this.exam_school_year_id = null;
        this.exam_school_time_stamp = null;
    }

    public Exam(String exam_id, String exam_name, String exam_school_year_id, String exam_school_time_stamp) {
        this.exam_id = exam_id;
        this.exam_name = exam_name;
        this.exam_school_year_id = exam_school_year_id;
        this.exam_school_time_stamp = exam_school_time_stamp;
    }

    /**
     * @return the Exam_id
     */
    public String getExam_id() {
        return exam_id;
    }

    /**
     * @param exam_id the Exam_id to set
     */
    public void setExam_id(String exam_id) {
        this.exam_id = exam_id;
    }

    /**
     * @return the Exam_name
     */
    public String getExam_name() {
        return exam_name;
    }

    /**
     * @param exam_name the Exam_name to set
     */
    public void setExam_name(String exam_name) {
        this.exam_name = exam_name;
    }

    /**
     * @return the Exam_school_year_id
     */
    public String getExam_school_year_id() {
        return exam_school_year_id;
    }

    /**
     * @param exam_school_year_id the Exam_school_year_id to set
     */
    public void setExam_school_year_id(String exam_school_year_id) {
        this.exam_school_year_id = exam_school_year_id;
    }

    /**
     * @return the Exam_school_time_stamp
     */
    public String getExam_school_time_stamp() {
        return exam_school_time_stamp;
    }

    /**
     * @param exam_school_time_stamp the Exam_school_time_stamp to set
     */
    public void setExam_school_time_stamp(String exam_school_time_stamp) {
        this.exam_school_time_stamp = exam_school_time_stamp;
    }
}
