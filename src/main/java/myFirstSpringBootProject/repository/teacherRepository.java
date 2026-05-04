package myFirstSpringBootProject.repository;

import myFirstSpringBootProject.models.teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface teacherRepository extends JpaRepository<teacher, Integer> { }

