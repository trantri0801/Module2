package LoopJava;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int index;
        int temp = array.length - 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be deleted: ");
        int number = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter position to insert: ");
        index = sc1.nextInt();
        while (temp >= index) {
            array[temp] = array[temp - 1];
            temp = temp - 1;
        }
        array[index] = number;
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
}
