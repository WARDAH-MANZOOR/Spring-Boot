package myFirstSpringBootProject.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL) // <--- Ye batata hai ke subjects bhi sath hi save karo
    @JoinTable(
            name = "teacher_subject",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private List<subject> subjects;


    // Default Constructor, Getters & Setters
    public teacher() {}
    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<subject> getSubjects() { return subjects; }
    public void setSubjects(List<subject> subjects) { this.subjects = subjects; }
}