package org.example.Homework3.Service;

import org.example.Homework3.Model.Account;

public class AccountService {

    public Account createNewAccount(String[] nameData, Long phoneNumber) {
        Account account = new Account();
        account.setLastName(nameData[0]);
        account.setFirstName(nameData[1]);
        account.setSecondName(nameData[2]);
        account.setPhoneNumber(phoneNumber);
        return account;
    }

    public String getAccountData(Account account) {
        return account.toString();
    }

}
