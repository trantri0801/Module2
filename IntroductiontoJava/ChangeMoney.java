package IntroductiontoJava;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so tien bang USD: ");
        usd = sc.nextDouble();
        double change = usd * vnd;
        System.out.print("Gia tri VND bang " + change);
    }
}
