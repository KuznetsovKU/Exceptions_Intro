package org.example.HW2New;

import org.example.Seminar3.DivisionByZeroException;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        try {
            System.out.println("Введите первое число");
            num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите второе число");
            num2 = Integer.parseInt(scanner.nextLine());
            if (num2 == 0)
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            System.out.print("Результат деления = ");
            System.out.println(num1 / num2);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка! Как минимум одно из введенных значений не является числом.");
        }
    }


}
