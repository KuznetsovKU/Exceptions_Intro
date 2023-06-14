package org.example.Seminar3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class S3Task1 {
    public static void main(String[] args) {
//        try {
//            task1();
//        }
//        catch (DivisionByZeroException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            task2(new String[]{"1", "2", "3", "4", null, "6"}, 4);
//        }
//        catch (NullElementArrayException e) {
//            System.out.printf("%s \nЕго индекс: %d", e.getMessage(), e.getIndex());
//        }

        try {
            task3("D:\\Personal documents\\Education\\=Projects\\Exeptions_Intro\\src\\main\\java\\org\\example\\Seminar3\\file1.txt");
        }
        catch (MyFileNotFoundException e) {
            System.out.printf("%s : %s", e.getMessage(), e.getFileName());
        }
    }

    static void task1(){
        try {
            int a = 10/0;
        }
        catch (ArithmeticException e) {
            throw new DivisionByZeroException("Ошибка деления на 0");
        }
    }

    static void task2(String[] arr, int index) {
        try {
            if (arr[index] == null) {
                throw new NullElementArrayException("Элемент массива не проинициализирован.", index);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    static void task3(String fileName) throws MyFileNotFoundException{
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            char[] buf = new char[256];
            int count;
            while ((count = fileReader.read(buf)) > 0) {
                if (count < 256) {
                    buf = Arrays.copyOf(buf, count);
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new MyFileNotFoundException("Файл не найден", fileName);
        }
        catch (IOException e) {
            System.out.println("Ошибка чтения.");
        }
        finally {
            try {
                fileReader.close();
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
