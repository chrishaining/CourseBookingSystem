package com.codeclan.CourseBookingSystem.components;

import com.codeclan.CourseBookingSystem.models.Booking;
import com.codeclan.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.models.Customer;
import com.codeclan.CourseBookingSystem.repositories.BookingRepository;
import com.codeclan.CourseBookingSystem.repositories.CourseRepository.CourseRepository;
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

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Course pythonCourse = new Course("Python", "Edinburgh", 5);
        courseRepository.save(pythonCourse);

        Course embroideryCourse = new Course("Embroidery", "Karachi", 5);
        courseRepository.save(embroideryCourse);

        Course spiderTamingCourse = new Course("Spider Taming", "Vladivostok", 2);
        courseRepository.save(spiderTamingCourse);

        Customer customer1 = new Customer("Chris Davidson", "Edinburgh", 22);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Shona Amanda Alexson", "Vladivostok", 18);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Cameron Robson", "Karachi", 81);
        customerRepository.save(customer3);

        Customer customer4 = new Customer("Ian Jordanson", "Mexico City", 19);
        customerRepository.save(customer4);

        Customer customer5 = new Customer("Ted Lilianoff", "Vladivostok", 31);
        customerRepository.save(customer5);

        Customer customer6 = new Customer("Joe Grahams", "London", 102);
        customerRepository.save(customer6);

        Booking booking1 = new Booking("03-08-19", customer1, pythonCourse);
        bookingRepository.save(booking1);

//        customer1.add(booking1);
//        customerRepository.save(customer1);
    }

}
