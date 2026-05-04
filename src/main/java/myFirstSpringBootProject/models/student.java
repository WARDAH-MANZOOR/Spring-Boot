package myFirstSpringBootProject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import java.util.List;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;


@Entity
public class student {
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<course> courses;
    public student() {
    }
    @Id  // <--- Ye add karein (Primary Key batane ke liye)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // <--- Ye ID auto-increment karega
    private int id;
//    private String name;
//    private float marks;

    // after validation added
    @NotBlank(message = "Name is required")
    private String name;

    @Min(value = 0, message = "Marks cannot be negative")
    @Max(value = 100, message = "Marks cannot exceed 100")
    private float marks;

    private String status; // Naya field status store karne ke liye



    // Constructor
    public student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public float getMarks() { return marks; } // Naam theek kiya (pehle getAge tha)
    public String getStatus() { return status; }

    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(float marks) {
        this.marks = marks;
    }

    public List<course> getCourses() { return courses; }
    public void setCourses(List<course> courses) { this.courses = courses; }


    // Setter for status (is ki zaroorat paray gi)
    public void setStatus(String status) {
        this.status = status;
    }
}