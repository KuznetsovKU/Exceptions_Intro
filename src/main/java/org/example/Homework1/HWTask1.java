package org.example.Homework1;

//1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import java.util.Scanner;

public class HWTask1 {
    public double divider() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String number1 = scanner.next();
        System.out.println("Введите второе число: ");
        String number2 = scanner.next();
        if (number1 == null || number2 == null) throw new RuntimeException("Не передано одно из значений.");
        try {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка! Как минимум одно из введенных значений не является числом.");
        }
        double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);
        if (num2 == 0) throw new RuntimeException("Деление на НОЛЬ не допускается.");
        else return num1 / num2;
    }
}
