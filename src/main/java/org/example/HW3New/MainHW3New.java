package org.example.HW3New;

import java.util.Scanner;

public class MainHW3New {
    public static void main(String[] args) {
        System.out.println("Придумайте пароль");
        System.out.println("Пароль должен быть не менее 8 символов.\n" +
                "Пароль должен содержать хотя бы одну цифру.\n" +
                "Пароль должен содержать хотя бы одну заглавную букву.");

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (PasswordVerifier.verifyPass(password))
            System.out.println("Пароль корректен");
        scanner.close();
    }
}
