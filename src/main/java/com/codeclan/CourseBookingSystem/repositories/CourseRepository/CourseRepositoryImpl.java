package com.codeclan.CourseBookingSystem.repositories.CourseRepository;

import com.codeclan.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> findCoursesByCustomer(Long customerId) {
        List<Course> results = null;
        Session session = entityManager.unwrap((Session.class));
        try {
            Criteria criteria = session.createCriteria(Course.class);
            criteria.createAlias("bookings", "bookingsAlias");
            criteria.add(Restrictions.eq("bookingsAlias.customer", customerId));

            results = criteria.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }

        return results;
    }




}
