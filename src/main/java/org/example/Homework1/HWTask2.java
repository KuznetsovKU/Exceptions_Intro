package org.example.Homework1;

//2) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//   каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов
//   не равны, необходимо как-то оповестить пользователя.

public class HWTask2 {
    public int[] arraySubtraction(int[] firstArray, int[] secondArray) {
        int[] outputArray = new int[firstArray.length];
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < outputArray.length; i++) {
                outputArray[i] = firstArray[i] - secondArray[i];
            }
        } else {
            throw new RuntimeException("Ошибка! Массивы не равны по длине");
            }
        return outputArray;
    }
}
