package org.example.Homework3.View;

public class ExceptionsDescription {

    public String MyArraySizeDescription() {
        return "Передано некорректное количество данных.";
    }

    public String MyIllegalPhoneNumberDescription() {
        return "Номер телефона введен некорректно.";
    }

    public String MyIllegalPhoneNumberLengthDescription(int expected, int provided) {
        return "Некорректная длина телефонного номера. Ожидалось: " + expected + ". Введено: " + provided + ".";
    }

    public String MyIllegalNameInfoException(int blockNumber) {
        String[] blockNumbers = new String[]{"Фамилия", "Имя", "Отчество"};
        return "Информация в блоке " + blockNumbers[blockNumber] + " записана некорректно";
    }

    public String FileNotFoundDescription() {
        return "Файл не найден";
    }

    public String FileAlreadyExistsDescription() {
        return "Файл уже существует.";
    }
}
