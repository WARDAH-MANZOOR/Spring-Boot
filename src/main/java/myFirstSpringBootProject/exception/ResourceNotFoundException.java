package myFirstSpringBootProject.exception;

// RuntimeException ko extend karne se ye 'Unchecked Exception' ban jati hai
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}