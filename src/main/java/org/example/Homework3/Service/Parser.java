package org.example.Homework3.Service;

import org.example.Homework3.MyExceptions.MyArraySizeException;
import org.example.Homework3.MyExceptions.MyIllegalNameInfoException;
import org.example.Homework3.MyExceptions.MyIllegalPhoneNumberException;
import org.example.Homework3.View.ExceptionsDescription;

import java.util.Arrays;

public class Parser {
    ExceptionsDescription exDesc = new ExceptionsDescription();

    private final int accountDataArrayLength = 4;
    private final int phoneNumberLength = 10;

    public int getAccountDataArrayLength() {
        return accountDataArrayLength;
    }

    public int getPhoneNumberLength() {
        return phoneNumberLength;
    }

    public String[] checkDataAmount(String inputData) {
        String[] data = inputData.split(" ");
        if (data.length != accountDataArrayLength) {
            throw new MyArraySizeException(exDesc.MyArraySizeDescription(), data.length);
        }
        return data;
    }

    public Long checkPhoneNumber(String inputNumber) {
        Long phoneNumber = null;
        if (inputNumber.length() == phoneNumberLength) {
            try {
                phoneNumber = Long.parseLong(inputNumber);
            } catch (IllegalArgumentException e) {
                throw new MyIllegalPhoneNumberException(exDesc.MyIllegalPhoneNumberDescription());
            }
        } else {
            throw new MyIllegalPhoneNumberException(exDesc.MyIllegalPhoneNumberLengthDescription(phoneNumberLength, inputNumber.length()));

        }
        return phoneNumber;
    }

    public String[] isOnlyLetters(String[] inputData) {
        String[] result = Arrays.copyOf(inputData, 3);
        for (int i = 0; i < result.length; i++) {
            char[] chars = result[i].toCharArray();
            for (char c : chars) {
                if (!Character.isLetter(c)) {
                    throw new MyIllegalNameInfoException(exDesc.MyIllegalNameInfoException(i));
                }
            }
        }
        return result;
//        String alphabet = "qwertyuiopasdfghjklzxcvbnmёйцукенгшщзхъфывапролджэячсмитьбю";
//        for (int i = 0; i < result.length; i++) {
//            char[] chars = result[i].toCharArray();
//            for (Character c : chars) {
//                if (!alphabet.contains(c.toString())) {
//                    throw new MyIllegalNameInfoException(exDesc.MyIllegalNameInfoException(i));
//                }
//            }
//        }
//        return result;
    }
}
