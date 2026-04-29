package myFirstSpringBootProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController    // API class banata hai
public class myClass {

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
}
