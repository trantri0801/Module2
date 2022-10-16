package Array;

import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua ma tran vuong: ");
        index = Integer.parseInt(sc.nextLine());
        float[][] array = new float[index][index];
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < index; j++) {
                System.out.print("Nhap phan tu thu [" + i + ", " + j + "]: ");
                array[i][j] = Float.parseFloat(sc.nextLine());
            }
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < index; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        float sum = 0;
        for (int i = 0; i < index; i++) {
            sum = sum + array[i][i];
        }
        System.out.println("Tong cua duong cheo ma tran bang = " + sum);
    }
}
