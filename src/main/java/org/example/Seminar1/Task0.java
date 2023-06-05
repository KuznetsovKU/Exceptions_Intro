package org.example.Seminar1;

// Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
// Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

public class Task0 {
    public int checkArray(int[] inputArray, int length) {
        if (inputArray == null) return -3;
        if (inputArray.length < length) return -1;
        return inputArray.length;
    }
}
