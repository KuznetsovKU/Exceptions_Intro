package org.example.Seminar3;

public class Counter implements AutoCloseable{
    private int counter;
    private boolean isOpen;

    public Counter() {
        this.counter = 0;
        this.isOpen = true;
    }

    public Counter(int counter) {
        this.counter = counter;
        this.isOpen = true;
    }

    public int add() throws CloseCounterException{
        if (!isOpen) {
            throw new CloseCounterException("Счетчик закрыт.");
        }
        return ++counter;
    }

    public void closeCounter() {
        this.isOpen = false;
    }

    @Override
    public void close() {
        closeCounter();
    }

    @Override
    public String toString() {
        return "" + this.counter;
    }
}
