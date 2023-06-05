package org.example.Seminar1;

//        Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//        Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
//        метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
//        Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

public class Task2 {
    public int checkMatrix(int[][] inputMatrix) {
        if (inputMatrix.length != inputMatrix[0].length) {
            throw new RuntimeException("Матрица не квадратная!");
        }
        int matrixSum = 0;
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                if (inputMatrix[i][j] != 1 && inputMatrix[i][j] != 0) {
                    throw new RuntimeException("Значение элемента массива не соответствует условию задачи");
                } else {
                    matrixSum += inputMatrix[i][j];
                }
            }
        }
        return matrixSum;
    }
}
