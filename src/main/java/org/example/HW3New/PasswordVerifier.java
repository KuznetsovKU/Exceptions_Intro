package org.example.HW3New;

public class PasswordVerifier {
    public static boolean verifyPass (String password) {
        if (!isValidLength(password, 8))
            throw new IllegalArgumentException("Некорректная длина пароля. Пароль должен содержать не менее 8 символов");
        if (!isDigitInclude(password))
            throw new IllegalArgumentException("Ошибка! Пароль должен содержать не менее одной цифры");
        if (!isUpperCaseInclude(password))
            throw new IllegalArgumentException("Ошибка! Пароль должен содержать не менее одной заглавной буквы");
        return true;
    }

    private static boolean isValidLength(String password, int length) {
        return password.length() >= length;
    }

    private static boolean isDigitInclude(String password) {
        for (char c: password.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }

    private static boolean isUpperCaseInclude(String password) {
        for (char c: password.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }
}
