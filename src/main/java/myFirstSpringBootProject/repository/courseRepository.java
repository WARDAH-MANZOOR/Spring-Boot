package myFirstSpringBootProject.repository;

import myFirstSpringBootProject.models.course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface courseRepository extends JpaRepository<course, Long> {
}