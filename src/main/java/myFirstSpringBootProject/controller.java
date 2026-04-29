package myFirstSpringBootProject;

import org.springframework.beans.factory.annotation.Autowired; //Ye import Spring ko allow karta hai ke wo
// khud se service ka object dhoonde aur aapke controller mein "insert" ya "plug-in" kar de. Aapko new
// service() likhne ki zaroorat nahi parti.
import org.springframework.web.bind.annotation.*;

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
}