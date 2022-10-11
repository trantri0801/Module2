package LoopJava;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be deleted: ");
        int number = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                index = i;
            }
        }
        System.out.println(index);
        for (; index < array.length - 1; index++) {
            array[index] = array[index + 1];
        }
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + ", ");
        }
    }
}
