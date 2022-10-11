package LoopJava;

import java.util.Scanner;

public class ChangeShape {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("1. Print the rectangle");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j < 8; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                }
                case 2: {
                    System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                }
                case 3: {
                    System.out.println("3. Print isosceles triangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= 4 - i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                }
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
