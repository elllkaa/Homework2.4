package exeptions;

public class WrongLoginException extends RuntimeException {

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException(String message, Throwable cause) {
        super(message, cause);
    }
}
