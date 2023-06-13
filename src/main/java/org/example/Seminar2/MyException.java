package org.example.Seminar2;

abstract class MyException extends Exception{
    private final int x;
    private final int y;

    public MyException(String message, int x, int y) {
        super(message);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
