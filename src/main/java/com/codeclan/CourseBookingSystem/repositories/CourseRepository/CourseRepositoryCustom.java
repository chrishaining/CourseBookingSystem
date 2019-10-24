package com.codeclan.CourseBookingSystem.repositories.CourseRepository;

import com.codeclan.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.models.Customer;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> findCoursesByCustomer(Long customerId);
}
