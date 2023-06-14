package org.example.Seminar3;

public class S3Task2 {
    public static void main(String[] args) {
        try (Counter counter1 = new Counter()){
//            Counter counter1 = new Counter();
            System.out.printf("Текущее значение счетчика %s\n", counter1);
            counter1.add();
            System.out.printf("Текущее значение счетчика %s\n", counter1);
//            counter1.closeCounter();
//            counter1.add();
        }
        catch (CloseCounterException e) {
            System.out.println("Ошибка " + e.getMessage());
        }
    }
}
