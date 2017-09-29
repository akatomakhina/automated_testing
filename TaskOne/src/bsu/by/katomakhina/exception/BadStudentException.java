package bsu.by.katomakhina.exception;

/**
 * Created by user on 13.09.2017.
 */
public class BadStudentException extends Exception {

    public BadStudentException() {
        super();
    }

    public BadStudentException(String message) {
        super(message);
    }

    public BadStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadStudentException(Throwable cause) {
        super(cause);
    }

    public BadStudentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
