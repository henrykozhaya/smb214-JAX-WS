package com.tigergrandson.jpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author henry_kozhaya
 */
@Entity
public class Person implements Serializable {
    @Id
    private String person_id;
    private String person_first_name;
    private String person_last_name;
    private String person_dob;
    private String person_gender;
    private String person_email;
    private String person_phone_1;
    private String person_phone_2;
    private String person_phone_3;
    private String person_address_1;
    private String person_address_2;
    private String person_blood_group;
    private String person_time_stamp;

    public Person() {
        this.person_id = null;
        this.person_first_name = null;
        this.person_last_name = null;
        this.person_dob = null;
        this.person_gender = null;
        this.person_email = null;
        this.person_phone_1 = null;
        this.person_phone_2 = null;
        this.person_phone_3 = null;
        this.person_address_1 = null;
        this.person_address_2 = null;
        this.person_blood_group = null;
        this.person_time_stamp = null;
    }
    public Person(String person_id, String person_first_name, String person_last_name, String person_dob, String person_gender, String person_email, String person_phone_1, String person_phone_2, String person_phone_3, String person_address_1, String person_address_2, String person_blood_group, String person_time_stamp) {
        this.person_id = person_id;
        this.person_first_name = person_first_name;
        this.person_last_name = person_last_name;
        this.person_dob = person_dob;
        this.person_gender = person_gender;
        this.person_email = person_email;
        this.person_phone_1 = person_phone_1;
        this.person_phone_2 = person_phone_2;
        this.person_phone_3 = person_phone_3;
        this.person_address_1 = person_address_1;
        this.person_address_2 = person_address_2;
        this.person_blood_group = person_blood_group;
        this.person_time_stamp = person_time_stamp;
    }
    
    /**
     * @return the person_id
     */
    public String getPerson_id() {
        return person_id;
    }

    /**
     * @param person_id the person_id to set
     */
    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    /**
     * @return the person_first_name
     */
    public String getPerson_first_name() {
        return person_first_name;
    }

    /**
     * @param person_first_name the person_first_name to set
     */
    public void setPerson_first_name(String person_first_name) {
        this.person_first_name = person_first_name;
    }

    /**
     * @return the person_last_name
     */
    public String getPerson_last_name() {
        return person_last_name;
    }

    /**
     * @param person_last_name the person_last_name to set
     */
    public void setPerson_last_name(String person_last_name) {
        this.person_last_name = person_last_name;
    }

    /**
     * @return the person_dob
     */
    public String getPerson_dob() {
        return person_dob;
    }

    /**
     * @param person_dob the person_dob to set
     */
    public void setPerson_dob(String person_dob) {
        this.person_dob = person_dob;
    }

    /**
     * @return the person_gender
     */
    public String getPerson_gender() {
        return person_gender;
    }

    /**
     * @param person_gender the person_gender to set
     */
    public void setPerson_gender(String person_gender) {
        this.person_gender = person_gender;
    }

    /**
     * @return the person_email
     */
    public String getPerson_email() {
        return person_email;
    }

    /**
     * @param person_email the person_email to set
     */
    public void setPerson_email(String person_email) {
        this.person_email = person_email;
    }

    /**
     * @return the person_phone_1
     */
    public String getPerson_phone_1() {
        return person_phone_1;
    }

    /**
     * @param person_phone_1 the person_phone_1 to set
     */
    public void setPerson_phone_1(String person_phone_1) {
        this.person_phone_1 = person_phone_1;
    }

    /**
     * @return the person_phone_2
     */
    public String getPerson_phone_2() {
        return person_phone_2;
    }

    /**
     * @param person_phone_2 the person_phone_2 to set
     */
    public void setPerson_phone_2(String person_phone_2) {
        this.person_phone_2 = person_phone_2;
    }

    /**
     * @return the person_phone_3
     */
    public String getPerson_phone_3() {
        return person_phone_3;
    }

    /**
     * @param person_phone_3 the person_phone_3 to set
     */
    public void setPerson_phone_3(String person_phone_3) {
        this.person_phone_3 = person_phone_3;
    }

    /**
     * @return the person_address_1
     */
    public String getPerson_address_1() {
        return person_address_1;
    }

    /**
     * @param person_address_1 the person_address_1 to set
     */
    public void setPerson_address_1(String person_address_1) {
        this.person_address_1 = person_address_1;
    }

    /**
     * @return the person_address_2
     */
    public String getPerson_address_2() {
        return person_address_2;
    }

    /**
     * @param person_address_2 the person_address_2 to set
     */
    public void setPerson_address_2(String person_address_2) {
        this.person_address_2 = person_address_2;
    }

    /**
     * @return the person_blood_group
     */
    public String getPerson_blood_group() {
        return person_blood_group;
    }

    /**
     * @param person_blood_group the person_blood_group to set
     */
    public void setPerson_blood_group(String person_blood_group) {
        this.person_blood_group = person_blood_group;
    }

    /**
     * @return the person_time_stamp
     */
    public String getPerson_time_stamp() {
        return person_time_stamp;
    }

    /**
     * @param person_time_stamp the person_time_stamp to set
     */
    public void setPerson_time_stamp(String person_time_stamp) {
        this.person_time_stamp = person_time_stamp;
    }
}