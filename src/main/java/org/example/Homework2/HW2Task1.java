package org.example.Homework2;

import java.util.Scanner;

/**
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у
пользователя ввод данных.
*/


public class HW2Task1 {
    public float enterNumber() {
        float number = 0.0F;
        boolean flag = true;
        System.out.print("Введите дробное число: ");
        while (flag) {
            String num = new Scanner(System.in).next();
            try {
                number = parseNumber(num);
                flag = false;
            }
            catch (floatParseException e) {
                System.out.println(e.getMessage());
            }

        }
        return number;
    }

    private static float parseNumber(String inputNumber) throws floatParseException {
        if (countPointsOrCommas(inputNumber) == 1) {
            try {
                return Float.parseFloat(inputNumber);
            }
            catch (NumberFormatException e) {
                throw new floatParseException("Введено не корректное значение. Попробуйте снова.");
            }
        }else {
            throw new floatParseException("Введено не корректное значение. Попробуйте снова.");
        }
    }

    private static int countPointsOrCommas(String inputString) {
        int counter = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '.' || inputString.charAt(i) == ',') {
                counter ++;
            }
        }
        return counter;
    }
}

