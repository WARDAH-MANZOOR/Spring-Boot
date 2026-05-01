package myFirstSpringBootProject.repository;
import myFirstSpringBootProject.models.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<student, Integer> {
}
