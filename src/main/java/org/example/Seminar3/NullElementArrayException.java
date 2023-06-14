package org.example.Seminar3;

public class NullElementArrayException extends RuntimeException{

    private int index;
    public NullElementArrayException(String message, int index) {
        super(message);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
