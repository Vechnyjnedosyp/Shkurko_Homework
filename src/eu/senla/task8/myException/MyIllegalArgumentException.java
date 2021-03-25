package eu.senla.task8.myException;

public class MyIllegalArgumentException extends Exception{

    public MyIllegalArgumentException() {
    }

    public MyIllegalArgumentException(String message) {
        super(message);
    }

    public MyIllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyIllegalArgumentException(Throwable cause) {
        super(cause);
    }
}
