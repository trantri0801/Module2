package LoopJava;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[7];
        int[] array3 = new int[12];
        int index, temp;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the element of the array 1: ");
            index = sc.nextInt();
            array1[i] = index;
        }
        for (int j = 0; j < 7; j++) {
            System.out.println("Enter the element of the array 2: ");
            temp = sc1.nextInt();
            array2[j] = temp;
        }
        System.arraycopy(array1, 0, array3, 0, 5);
        System.arraycopy(array2, 0, array3, 5, 7);
        System.out.print("Array3 bao gom: ");
        for (int i : array3) {
            System.out.print(i + ", ");
        }
    }
}
