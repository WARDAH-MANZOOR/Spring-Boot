package myFirstSpringBootProject.dto;

public class studentDTO {

    private String name;
    private float marks;
    private String status;


    public studentDTO(String name, float marks, String status) {
        this.name = name;
        this.marks = marks;
        this.status = status;
    }

    // Getters
    public String getName() { return name; }
    public float getMarks() { return marks; } // Naam theek kiya (pehle getAge tha)
    public String getStatus() { return status; }

    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(float marks) {
        this.marks = marks;
    }


    // Setter for status (is ki zaroorat paray gi)
    public void setStatus(String status) {
        this.status = status;
    }
}
