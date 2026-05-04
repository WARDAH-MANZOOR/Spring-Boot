package myFirstSpringBootProject.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @ManyToMany(mappedBy = "subjects") // Teacher class mein jo variable name hai
    @JsonIgnore // Loop se bachne ke liye
    private List<teacher> teachers;

    // Default Constructor, Getters & Setters
    public subject() {}
    public int getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public List<teacher> getTeachers() { return teachers; }
    public void setTeachers(List<teacher> teachers) { this.teachers = teachers; }
}