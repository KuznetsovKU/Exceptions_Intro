package org.example.Homework3.MyExceptions;

public class MyIllegalPhoneNumberException extends IllegalArgumentException{
//    private final int phoneNumberLength;

    public MyIllegalPhoneNumberException(String s) {
        super(s);
//        this.phoneNumberLength = 0;
    }

//    public MyIllegalPhoneNumberException(String s, int phoneNumberLength) {
//        super(s);
//        this.phoneNumberLength = phoneNumberLength;
//    }
//
//    public int getPhoneNumberLength() {
//        return phoneNumberLength;
//    }


}
