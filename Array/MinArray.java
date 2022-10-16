package Array;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scr = new Scanner(System.in);
        int size;
        System.out.println("Nhap do dai cua mang: ");
        size = sc.nextInt();
        int[] array = new int[size];
        int index;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element of the array 1: ");
            index = scr.nextInt();
            array[i] = index;
        }
        for (int i : array) {
            System.out.print(i + ", ");
        }
        int min = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Phan tu nho nhat trong mang: " + min);
    }
}
