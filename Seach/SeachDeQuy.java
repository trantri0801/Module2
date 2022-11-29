package Seach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SeachDeQuy {
    public static int search(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số lượng phần tử của mảng");
            n = Integer.parseInt(scanner.nextLine());
        } while (n < 0);
        int[] array = new int[n];
        System.out.println("Nhập vào bàn phím các số");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào số thứ " + i + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(array);
        System.out.println("Hiển thị mảng vừa nhập: " + Arrays.toString(array));
        System.out.println("Nhập số cần tìm kiếm trong mảng");
        int search = Integer.parseInt(scanner.nextLine());
        System.out.println("Tìm thấy số " + search + " tại vị trí: " + search(array, search));
    }
}
