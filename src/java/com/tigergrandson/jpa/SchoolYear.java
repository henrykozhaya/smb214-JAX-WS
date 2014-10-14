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
public class SchoolYear {
    private String school_year_id;
    private String school_year_name;
    private String school_year_start_date;
    private String school_year_end_date;
    private String school_year_time_stamp;

    public SchoolYear() {
        this.school_year_id = null;
        this.school_year_name = null;
        this.school_year_start_date = null;
        this.school_year_end_date = null;
        this.school_year_time_stamp = null;        
    }

    public SchoolYear(String school_year_id, String school_year_name, String school_year_start_date, String school_year_end_date, String school_year_time_stamp) {
        this.school_year_id = school_year_id;
        this.school_year_name = school_year_name;
        this.school_year_start_date = school_year_start_date;
        this.school_year_end_date = school_year_end_date;
        this.school_year_time_stamp = school_year_time_stamp;
    }

    /**
     * @return the SchoolYear_id
     */
    public String getSchool_year_id() {
        return school_year_id;
    }

    /**
     * @param school_year_id the SchoolYear_id to set
     */
    public void setSchool_year_id(String school_year_id) {
        this.school_year_id = school_year_id;
    }

    /**
     * @return the SchoolYear_name
     */
    public String getSchool_year_name() {
        return school_year_name;
    }

    /**
     * @param school_year_name the SchoolYear_name to set
     */
    public void setSchool_year_name(String school_year_name) {
        this.school_year_name = school_year_name;
    }

    /**
     * @return the SchoolYear_start_date
     */
    public String getSchool_year_start_date() {
        return school_year_start_date;
    }

    /**
     * @param school_year_start_date the SchoolYear_start_date to set
     */
    public void setSchool_year_start_date(String school_year_start_date) {
        this.school_year_start_date = school_year_start_date;
    }

    /**
     * @return the SchoolYear_end_date
     */
    public String getSchool_year_end_date() {
        return school_year_end_date;
    }

    /**
     * @param school_year_end_date the SchoolYear_end_date to set
     */
    public void setSchool_year_end_date(String school_year_end_date) {
        this.school_year_end_date = school_year_end_date;
    }

    /**
     * @return the SchoolYear_time_stamp
     */
    public String getSchool_year_time_stamp() {
        return school_year_time_stamp;
    }

    /**
     * @param school_year_time_stamp the SchoolYear_time_stamp to set
     */
    public void setSchool_year_time_stamp(String school_year_time_stamp) {
        this.school_year_time_stamp = school_year_time_stamp;
    }
}
