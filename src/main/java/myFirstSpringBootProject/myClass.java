package myFirstSpringBootProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController    // API class banata hai
public class myClass {

    // static api:fixed response

    @GetMapping("hello")    // URL define karta hai
    public String sayHello(){

        return "Hello World";
    }

    @GetMapping("myname")    // URL define karta hai
    public String myName(){

        return "My name is Wardah";
    }

    @GetMapping("date")    // URL define karta hai
    public String date(){

        return LocalDate.now().toString();
    }
   // dynamic api --- response changes accoridng to user input
    @GetMapping("/hello/{name}") // path variable in url
    public String greet(@PathVariable String name) {
        return "Hello " + name + ", welcome to Spring Boot 🚀";
    }
    @GetMapping("/search") // query parameter in url
    public String search(@RequestParam String query) {
        return "You searched for: " + query;  // example: http://localhost:8080/search?query=springboot
    }
    @GetMapping("/age")
    public String age(@RequestParam int year) { // example: http://localhost:8080/age?year=2001
        int currentYear = 2026;
        return "Your age is: " + (currentYear - year);
    }

    @GetMapping("/status")
    public String status() {
        return "Spring Boot is running fine 👍";
    }
}
