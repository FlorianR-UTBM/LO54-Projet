/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author kaled
 */
@Entity
@Table(name = "COURSE_SESSION")
public class CourseSession implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "START_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "END_DATE")
    private Date endDate;
    @Column(name = "MAX_CLIENTS")
    private int maxClients;
    @Column(name = "COURSE_CODE")
    private String courseCode;
    @Column(name = "LOCATION_ID")
    private int locationId;

    public CourseSession() {

    }

    public int getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getMaxClients() {
        return maxClients;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setMaxClients(int maxClients) {
        this.maxClients = maxClients;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public CourseSession(Date startDate, Date endDate, int maxClients, String courseCode, int locationId) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxClients = maxClients;
        this.courseCode = courseCode;
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return "CourseSession{" + "id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", maxClients=" + maxClients + ", courseCode=" + courseCode + ", locationId=" + locationId + '}';
    }

}
