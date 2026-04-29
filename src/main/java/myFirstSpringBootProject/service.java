package myFirstSpringBootProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service {
    @Autowired
    studentRepository repo;

    public int square(int num) {
        return num * num;
    }

    public int cube(int num) {
        return num * num * num;
    }

    public String greet(String name) {
        return "Hello " + name + " 👋";
    }
    public String fullName(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName + " 👋";
    }
    public user getUserData() {// Service ne ek naya User object create kiya aur Controller ko de diya.
        return new user(1, "Wardah", 22); // Spring Boot ne dekha ke tumne User object bheja hai,
        // usne usay "JSON" (wo brackets wali shakal { }) mein convert kiya
    }
    public student getStudentData(String name) {
        return new student(1, name, 76);

    }

    public user saveUser(user user) {
        // abhi sirf return kar rahe hain (database later)
        return user;
    }

    public student saveStudent(student student) {
        if (student.getMarks() > 50) {
            student.setStatus("Pass"); // Quotes zaroori hain aur setter use kiya
        } else {
            student.setStatus("Fail");
        }
//        return student;
        return repo.save(student);

    }
//    public student saveStudent1(student s) {
//        return repo.save(s);
//    }

    public List<student> getAllStudents() {
        return repo.findAll();
    }
}