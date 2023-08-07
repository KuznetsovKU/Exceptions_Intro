package org.example.HW2New;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
        int number;
        System.out.println("Введите какое-либо положительное число");
        try {
            number = Integer.parseInt(new Scanner(System.in).nextLine());
            if (number <= 0)
                throw new InvalidNumberException("Некорректное число");
            else System.out.println("Число корректно");
        } catch (IllegalArgumentException e) {
            System.out.println("Это не число");
        }
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}
