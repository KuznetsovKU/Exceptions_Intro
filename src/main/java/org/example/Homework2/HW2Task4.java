package org.example.Homework2;


import java.util.Objects;
import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно
 * показаться сообщение, что пустые строки вводить нельзя.
 */
public class HW2Task4 {
    public String askSomeData() {
        String data = null;
        boolean flag = true;
        System.out.print("Введите какое-либо значение: ");
        while (flag) {
            data = new Scanner(System.in).next();
            try {
                data = isNotNull(data.replace('.', ' ').trim());
                flag = false;
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return data;
    }

    private static String isNotNull(String text) {
        if (text == null || text.isEmpty()) {
            throw new RuntimeException("Никакого значения не введено. Попробуйте снова: ");
        } else {
            return text;
        }
    }
}
