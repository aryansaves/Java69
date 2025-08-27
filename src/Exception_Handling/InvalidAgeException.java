package Exception_Handling;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {

        super(message);
    }
}
