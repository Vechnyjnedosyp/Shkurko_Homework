package eu.senla.task8.myExceptions;

public class MyNegativeArraySizeException extends RuntimeException{

    private int capacity;

    public MyNegativeArraySizeException() {
    }

    public MyNegativeArraySizeException(String message) {
        super(message);
    }

    public MyNegativeArraySizeException(String message, int capacity) {
        this(message);
        this.capacity = capacity;
    }

    public MyNegativeArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyNegativeArraySizeException(Throwable cause) {
        super(cause);
    }
}
