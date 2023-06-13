package org.example.Seminar2;

import java.util.Random;

public class Sem2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация " + (i + 1));
            processArray();
        }

    }

    static Random random = new Random();

    public static void processArray() {
        try {
            System.out.printf("Сумма элементов массива: %d \n", processArrayInternal(generateArray()));
        }
        catch (MyArraySizeException e) {
            System.out.printf("%s\n Требуется ввести массив 4*4, получили %d %d\n", e.getMessage(), e.getX(), e.getY());
        }
        catch (MyArrayDataException e) {
            System.out.printf("%s\n Элемент под индексом [%d] [%d]\n", e.getMessage(), e.getX(), e.getY());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Завершение обработки ----------");
        }
    }
    public static String[][] generateArray() {
        int add = random.nextInt(2);
        String[][] arr = new String[4 + add][4 + add];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (random.nextInt(30) < 2) {
                    arr[i][j] = "aaa";
                } else {
                    arr[i][j] = Integer.toString(random.nextInt(100));
                }
                System.out.printf("%s ", arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }

    private static int processArrayInternal(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException("Некорректный размер массива", arr.length, arr[0].length);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += parseElement(arr[i][j], i, j);
            }
        }
        return sum;
    }

    private static int parseElement(String element, int i, int j) throws MyArrayDataException {
        try {
            return Integer.parseInt(element);
        }
        catch (NumberFormatException e) {
            throw new MyArrayDataException("Некорректный формат данных", i, j);
        }
    }
}
