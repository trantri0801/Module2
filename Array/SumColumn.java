package Array;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {

        int column, row, temp;
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter column: ");
        column = Integer.parseInt(sc.nextLine());
        System.out.println("Enter row: ");
        row = Integer.parseInt(sc.nextLine());
        float[][] array = new float[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Nhap phan tu thu [" + i + ", " + j + "]: ");
                array[i][j] = Float.parseFloat(sc.nextLine());
            }
        }
        System.out.print("In mang\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        do {
            System.out.println("Ban muon tinh tong cot may: ");
            temp = Integer.parseInt(sc.nextLine());
        } while (temp >= column);
        for (int i = 0; i < row; i++) {
            sum = sum + array[i][temp];
        }
        System.out.println("Tong cua cot " + temp + " bang = " + sum);
    }
}
