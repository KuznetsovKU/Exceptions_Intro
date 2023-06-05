package org.example.Homework1;

//3) * Дополнительно * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
//     новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//     Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода
//     единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
public class HWTask3 {
    public int[] arrayDivision(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) throw new RuntimeException("Ошибка! Массивы не равны по длине.");
        else {
            int[] outputArray = new int[firstArray.length];
            for (int i = 0; i < outputArray.length; i++) {
                if (secondArray[i] == 0) throw new RuntimeException("Ошибка! На НОЛЬ делить нельзя.");
                else outputArray[i] = firstArray[i] / secondArray[i];
            }
            return outputArray;
        }
    }
}
