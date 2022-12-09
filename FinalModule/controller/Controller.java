package FinalModule.controller;

import FinalModule.service.AccountServiceImpl;
import FinalModule.service.IAccountService;

import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);
    private static IAccountService accountService = new AccountServiceImpl();

    public static void main(String[] args) {
        while (true){
            System.out.println("Chon chuc nang theo so(de tiep tuc):");
            System.out.println("1. Them moi");
            System.out.println("2. Xoa");
            System.out.println("3. Xem danh sach cac tai khoan ngan hang");
            System.out.println("4. Tim kiem");
            System.out.println("5. Thoat");
            switch (scanner.nextInt()){
                case 1:
                    accountService.addAccount();
                    break;
                case 2:
                    accountService.removeAccount();
                    break;
                case 3:
                    accountService.displayList();
                    break;
                case 4:
                    accountService.seachAccount();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
