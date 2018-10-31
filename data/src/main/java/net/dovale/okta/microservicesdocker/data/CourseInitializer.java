package net.dovale.okta.microservicesdocker.data;

import net.dovale.okta.microservicesdocker.data.entities.Course;
import net.dovale.okta.microservicesdocker.data.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CourseInitializer {

    final CourseRepository courseRepository;

    @Autowired
    public CourseInitializer(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @PostConstruct
    public void initializeCourse(){
        courseRepository.save(new Course("Build Spring MicroServices and Dockerire them", "Raphael", 10));
        courseRepository.save(new Course("Data Persistence with Hibernate and Spring", "Raphael", 5));
        courseRepository.save(new Course("Using PostgreSQL with Hibernate and Spring", "Raphael", 15));
    }
}
