package myFirstSpringBootProject;

public class student {
    private int id;
    private String name;
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

    // Setter for status (is ki zaroorat paray gi)
    public void setStatus(String status) {
        this.status = status;
    }
}