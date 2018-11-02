/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.interf;

import com.lo54.projet.dao.data.Course;

/**
 * DAO class for COURSE table.
 */
public interface CourseDao {

    /**
     * Create a new Course in COURSE table.
     *
     * @param course the course to create.
     */
    public void create(Course course);

}
