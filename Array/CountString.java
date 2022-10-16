package Array;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp;
        System.out.println("Nhap chuoi: ");
        temp = sc.nextLine();
        int count = 0;
        System.out.println("Nhap ki tu can check: ");
        char characters = sc.nextLine().charAt(0);
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == characters) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ki tu " + characters +
                " trong chuoi " + temp + " = " + count);
    }
}
