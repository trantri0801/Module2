package Array;

import java.util.Scanner;

public class Array2c {
    public static void main(String[] args) {
        int column, row ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter column: ");
        column = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter row: ");
        row = sc1.nextInt();
        int[][] array = new int[column][row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
