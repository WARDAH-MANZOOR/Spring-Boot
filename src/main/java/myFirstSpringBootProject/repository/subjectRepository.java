package myFirstSpringBootProject.repository;

import myFirstSpringBootProject.models.subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface subjectRepository extends JpaRepository<subject, Integer> { }