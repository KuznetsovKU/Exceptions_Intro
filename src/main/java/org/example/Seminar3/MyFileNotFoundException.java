package org.example.Seminar3;


public class MyFileNotFoundException extends Exception {

    private String fileName;

    public MyFileNotFoundException(String message, String fileName) {
        super(message);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
