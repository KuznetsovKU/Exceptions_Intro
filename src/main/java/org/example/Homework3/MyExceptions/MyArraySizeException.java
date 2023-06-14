package org.example.Homework3.MyExceptions;

public class MyArraySizeException extends RuntimeException {
    private final int currentArraySize;

    public MyArraySizeException(String message, int currentArraySize) {
        super(message);
        this.currentArraySize = currentArraySize;
    }

    public int getCurrentArraySize() {
        return currentArraySize;
    }
}
