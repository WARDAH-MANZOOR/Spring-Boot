package myFirstSpringBootProject;

public class student {
    private int id;
    private String name;
    private float marks;

    // Constructor
    public student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public float getAge() { return marks; }
}
