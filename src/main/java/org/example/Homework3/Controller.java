package org.example.Homework3;

import org.example.Homework3.MyExceptions.MyArraySizeException;
import org.example.Homework3.MyExceptions.MyIllegalNameInfoException;
import org.example.Homework3.MyExceptions.MyIllegalPhoneNumberException;
import org.example.Homework3.Service.AccountService;
import org.example.Homework3.Service.FileService;
import org.example.Homework3.Service.Parser;
import org.example.Homework3.View.View;

import java.util.Scanner;

public class Controller {

    public void runProgram() {
        View view = new View();
        Parser parser = new Parser();
        boolean flag = true;
        while (flag) {
            view.askData();
            String inputData = new Scanner(System.in).nextLine();
            try {
                String[] checkedData = parser.checkDataAmount(inputData);
                try {
                    Long checkedPhoneNumber = parser.checkPhoneNumber(checkedData[3]);
                    try {
                        String[] nameInfo = parser.isOnlyLetters(checkedData);
                        updateFile(nameInfo, checkedPhoneNumber);
                        flag = false;
                    }
                    catch (MyIllegalNameInfoException e) {
                        System.out.println(e.getMessage());
                        view.tryAgain();
                    }
                }
                catch (MyIllegalPhoneNumberException e) {
                    System.out.println(e.getMessage());
                    view.tryAgain();
                }
            }
            catch (MyArraySizeException e) {
                System.out.printf("%s\nТребовалось элементов: %d, передано элементов:  %d.\n",
                        e.getMessage(), parser.getAccountDataArrayLength(), e.getCurrentArraySize());
                view.tryAgain();
            }
        }
    }

    private void updateFile(String[] nameInfo, Long checkedPhoneNumber) {
        AccountService accServ = new AccountService();
        FileService fServ = new FileService();
        fServ.fillFile(nameInfo[0], accServ.getAccountData(accServ.createNewAccount(nameInfo, checkedPhoneNumber)));
    }
}
