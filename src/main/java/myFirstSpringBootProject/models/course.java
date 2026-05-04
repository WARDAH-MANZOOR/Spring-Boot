package myFirstSpringBootProject.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    // Many courses belong to one student
    @ManyToOne
    @JoinColumn(name = "student_id") // Database mein student_id column banayega
    @JsonIgnore // Infinite loop se bachne ke liye
    private student student;

    // Default Constructor
    public course() {}

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public student getStudent() { return student; }
    public void setStudent(student student) { this.student = student; }
}