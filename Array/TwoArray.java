package Array;

import java.util.Scanner;

public class TwoArray {
    public static void main(String[] args) {
        int column, row;
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
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        float max = array[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: " + max);
    }
}
