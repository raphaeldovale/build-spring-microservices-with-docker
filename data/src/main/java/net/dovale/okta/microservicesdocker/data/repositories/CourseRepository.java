package net.dovale.okta.microservicesdocker.data.repositories;

import net.dovale.okta.microservicesdocker.data.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course,Long> {
}
