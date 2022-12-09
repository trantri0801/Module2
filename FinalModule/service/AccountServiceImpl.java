package FinalModule.service;

import FinalModule.model.Account;
import FinalModule.model.AccountPay;
import FinalModule.model.AccountTietKiem;
import FinalModule.repository.AccountRepositoryImpl;
import FinalModule.repository.IAccountRepository;

import java.util.List;
import java.util.Scanner;

public class AccountServiceImpl implements IAccountService {
    private static Scanner scanner = new Scanner(System.in);
    private static IAccountRepository accountRepository = new AccountRepositoryImpl();

    @Override
    public void addAccount() {
        int choice;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Tai khoan tiet kiem");
            System.out.println("2. Tai khoan thanh toan");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    accountRepository.addAccount(getAccountTietKiem());
                    break;
                case 2:
                    accountRepository.addAccount(getAccountPay());
                    break;
            }
        }while (choice <= 0 || choice > 2);
    }

    public void displayList(){
        List<Account> accountList = accountRepository.findAll();
        for (Account account : accountList){
            System.out.println(account);
        }
    }
    @Override
    public void removeAccount() {
        System.out.println("Enter ID to delete: ");
        int inputID = Integer.parseInt(scanner.nextLine());
        if (accountRepository.checkAccountName(inputID)){
            int choice;
            do {
                System.out.println("Are you sure: ");
                System.out.println("1. Yes");
                System.out.println("2. No");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        accountRepository.removeAccount(inputID);
                        System.out.println("Remove done!!!");
                        break;
                    case 2:
                        return;
                }
            }while (choice <= 0 || choice > 2);
        }else {
            System.out.println("ID invalid!!!");
            return;
        }
    }

    @Override
    public void seachAccount() {
        int choice;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Tim theo ID");
            System.out.println("2. Tim theo ten");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.printf("Nhap ID moblie can tim: ");
                    int temp = Integer.parseInt(scanner.nextLine());
                    accountRepository.findAccountByID(temp);
                    break;
                case 2:
                    System.out.printf("Nhap ten moblie can tim: ");
                    String name = scanner.nextLine();
                    accountRepository.findAccountByName(name);
                    break;
            }
        }while (choice <= 0 || choice > 2);
    }

    @Override
    public void seachByID() {

    }

    @Override
    public void seachByName() {

    }

    public Account getAccountTietKiem(){
        System.out.println("Input Account info: ");
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Ma Tai Khoan: ");
        String maTK = scanner.nextLine();
        System.out.println("Enter Ten Tai Khoan: ");
        String tenTK = scanner.nextLine();
        System.out.println("Enter Ngay Tao Tai Khoan: ");
        String Date = scanner.nextLine();
        System.out.println("Enter so tien goi tiet kiem: ");
        int Money = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter ngay goi tiet kiem: ");
        String DateGui = scanner.nextLine();
        System.out.println("Enter lai suat: ");
        String LaiSuat = scanner.nextLine();
        System.out.println("Enter Ky Han: ");
        int KyHan = Integer.parseInt(scanner.nextLine());

        AccountTietKiem tietKiem = new AccountTietKiem(id,maTK,tenTK,Date,Money,DateGui,LaiSuat,KyHan);
        return tietKiem;
    }

    public Account getAccountPay() {
        System.out.println("Input Account info: ");
        System.out.println("Enter ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Ma Tai Khoan: ");
        String maTK = scanner.nextLine();
        System.out.println("Enter Ten Tai Khoan: ");
        String tenTK = scanner.nextLine();
        System.out.println("Enter Ngay Tao Tai Khoan: ");
        String Date = scanner.nextLine();
        System.out.println("Enter so the: ");
        String SoThe = scanner.nextLine();
        System.out.println("Enter so tien trong tai khoan: ");
        String MoneyAccount = scanner.nextLine();

        AccountPay accountPay = new AccountPay(id,maTK,tenTK,Date,SoThe,MoneyAccount);
        return accountPay;
    }
}
