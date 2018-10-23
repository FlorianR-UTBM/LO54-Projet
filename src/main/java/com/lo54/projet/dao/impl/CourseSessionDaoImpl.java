/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lo54.projet.dao.impl;

import com.lo54.projet.dao.data.CourseSession;
import com.lo54.projet.dao.interf.CourseSessionDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Florian
 */
@Repository
public class CourseSessionDaoImpl implements CourseSessionDao {

    @PersistenceContext(unitName = "Formation")
    private EntityManager entityManager;

    @Override
    public List<CourseSession> getCourseSessionsFilteredByDate(String date) {
        String sQuery = "SELECT cs FROM CourseSession cs WHERE :date BETWEEN cs.startDate AND cs.endDate";
        TypedQuery<CourseSession> query = entityManager.createQuery(sQuery, CourseSession.class);
        query.setParameter("date", date);

        try {
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

    // TODO : revoir la requete SQL
    @Override
    public List<CourseSession> getCourseSessionsFilteredByCity(String city) {
        String sQuery = "SELECT cs FROM CourseSession cs LEFT JOIN Location l WHERE cs.id = l.id AND l.city = :city";
        TypedQuery<CourseSession> query = entityManager.createQuery(sQuery, CourseSession.class);
        query.setParameter("city", city);

        try {
            return query.getResultList();
        } catch (NoResultException e) {
            return null;
        }
    }

}