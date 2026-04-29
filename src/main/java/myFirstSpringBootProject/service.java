package myFirstSpringBootProject;

import org.springframework.stereotype.Service;

@Service
public class service {
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
}