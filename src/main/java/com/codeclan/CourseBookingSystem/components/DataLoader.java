package com.codeclan.CourseBookingSystem.components;

import com.codeclan.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.models.Customer;
import com.codeclan.CourseBookingSystem.repositories.CourseRepository;
import com.codeclan.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Course pythonCourse = new Course("Python", "Edinburgh", 5);
        courseRepository.save(pythonCourse);

        Customer customer1 = new Customer("Chris Davidson", "Edinburgh", 22);
        customerRepository.save(customer1);

    }
}
