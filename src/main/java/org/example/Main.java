package org.example;

import org.example.Homework1.HWTask1;
import org.example.Homework1.HWTask2;
import org.example.Homework1.HWTask3;
import org.example.Seminar1.Task1;

public class Main {
    public static void main(String[] args) {
        HWTask1 hwTask1 = new HWTask1();
        System.out.println(hwTask1.divider());

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 1, 2, 0};
//        HWTask2 hwTask2 = new HWTask2();
//        printArray(hwTask2.arraySubtraction(arr1, arr2));

//        HWTask3 hwTask3 = new HWTask3();
//        printArray(hwTask3.arrayDivision(arr1, arr2));


    }

    public static void printArray(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i] + "\t");
        }
    }
}