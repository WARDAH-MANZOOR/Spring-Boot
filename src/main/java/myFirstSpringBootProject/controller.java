package myFirstSpringBootProject;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired; //Ye import Spring ko allow karta hai ke wo
// khud se service ka object dhoonde aur aapke controller mein "insert" ya "plug-in" kar de. Aapko new
// service() likhne ki zaroorat nahi parti.
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {

    @Autowired
    service service;

    @GetMapping("/cube/{num}")
    public int getCube(@PathVariable int num) {
        return service.cube(num);
    }

    @GetMapping("/square/{num}")
    public int getSquare(@PathVariable int num) {
        return service.square(num);
    }


    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return service.greet(name);
    }

    @GetMapping("/fullName")
    public String fullName(@RequestParam String firstName, @RequestParam String lastName) {
        return service.fullName(firstName,lastName);
    }

    @GetMapping("/user") // browser pe URL hit kiya.
    public user getUser() { // Controller ne dekha "Achha, /user chahiye? Ruko, main Service se mangwata hoon.
        return service.getUserData();
    }
    @GetMapping("/student/{name}")
    public student getStudent(@PathVariable String name) {
        return service.getStudentData(name);
    }
    @PostMapping("/user")
    public user createUser(@RequestBody user user) {
        return service.saveUser(user);
    }
    @PostMapping("/student")
    public student createStudent(@Valid @RequestBody student student) {
        return service.saveStudent(student);
    }

    @GetMapping("/students")
    public List<student> getStudents() {
        return service.getAllStudents();
    }
    @PutMapping("/student/{id}")
    public student updateStudent(@PathVariable int id,
                                 @RequestBody student student) {
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id) {
        service.deleteStudent(id);
        return "Student deleted successfully";
    }

    @GetMapping("/student/id/{id}")
    public student getStudent(@PathVariable int id) {
        return service.getStudentbyID(id);

    }


}