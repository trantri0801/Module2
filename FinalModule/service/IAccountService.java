package FinalModule.service;

import FinalModule.model.Account;

public interface IAccountService {
    void addAccount();

    void displayList();

    void removeAccount();

    void seachAccount();

    void seachByID();

    void seachByName();

    Account getAccountTietKiem();

    Account getAccountPay();

}
