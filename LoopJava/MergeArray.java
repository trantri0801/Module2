package LoopJava;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[7];
        int[] array3 = new int[12];
        int index, index1;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the element of the array 1: ");
            index = sc.nextInt();
            array1[i] = index;
        }
        for (int j = 0; j < 7; j++) {
            System.out.println("Enter the element of the array 2: ");
            index1 = sc1.nextInt();
            array2[j] = index1;
        }
        for (int h = 0; h < 5; h++) {
            array3[h] = array1[h];
        }
        for (int f = 0; f < 7; f++) {
            array3[f + 5] = array2[f];
        }
        System.out.print("Array3 bao gom: ");
        for (int g = 0; g < array3.length; g++) {
            System.out.print(array3[g] + ", ");
        }
    }
}
