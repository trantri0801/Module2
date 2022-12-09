package FinalModule.repository;

import FinalModule.model.Account;

import java.util.List;

public interface IAccountRepository {
    void addAccount(Account account);

    List findAll();

    List findAccountByName(String inputName);

    List findAccountByID(int inputID);

    boolean checkAccountID(int inputID);

    boolean checkAccountName(String inputName);

    boolean checkAccountName(int inputID);

    void removeAccount(int inputID);
}
