package CaseStudy.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();

    }

    private static void displayMainMenu() {
        Scanner input = new Scanner(System.in);
        int temp = -1;
        while (temp != 0) {
            System.out.println("Menu");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            temp = input.nextInt();
            switch (temp) {
                case 1: {
                    int tempOne = -1;
                    while (tempOne != 0) {
                        System.out.println("Employee Management");
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu");
                        tempOne = input.nextInt();
                        switch (tempOne) {
//                            EmployeeServiceImpl employess = new EmployeeServiceImpl();
                            case 1:{

                            }
                            case 4: {
                                displayMainMenu();
                            }
                        }
                    }
                }
                case 2: {
                    int tempTwo = -1;
                    while (tempTwo != 0) {
                        System.out.println("1. Display list customers");
                        System.out.println("2. Add new customer");
                        System.out.println("3. Edit customer");
                        System.out.println("4. Return main menu");
                        tempTwo = input.nextInt();
                        switch (tempTwo) {
                            case 4: {
                                displayMainMenu();
                            }
                        }
                    }
                }
                case 3: {
                    int tempThree = -1;
                    while (tempThree != 0) {
                        System.out.println("1. Display list facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        tempThree = input.nextInt();
                        switch (tempThree) {
                            case 4: {
                                displayMainMenu();
                            }
                        }
                    }
                }
                case 4:
                    int tempFour = -1;
                    while (tempFour != 0) {
                        System.out.println("1. Add new booking");
                        System.out.println("2. Display list booking");
                        System.out.println("3. Create new constracts");
                        System.out.println("4. Display list contracts");
                        System.out.println("5. Edit contracts");
                        System.out.println("6. Return main menu");
                        tempFour = input.nextInt();
                        switch (tempFour) {
                            case 6: {
                                displayMainMenu();
                            }
                        }
                    }
                case 5:
                    int tempFive = -1;
                    while (tempFive != 0) {
                        System.out.println("1. Display list customers use service");
                        System.out.println("2. Display list customers get voucher");
                        System.out.println("3. Return main menu");
                        tempFive = input.nextInt();
                        switch (tempFive) {
                            case 3: {
                                displayMainMenu();
                            }
                        }
                    }
                case 6:
                    System.out.printf("Ban dang thoat chuong trinh");
                    System.exit(6);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
