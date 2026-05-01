package myFirstSpringBootProject.exception;

public class ErrorResponse {
    private String message;
    private int status;

    public ErrorResponse(String message, int status) {
        this.message = message;
        this.status = status;
    }

    // Getters aur Setters zaroori hain taake Spring JSON bana sake
    public String getMessage() { return message; }
    public int getStatus() { return status; }
}