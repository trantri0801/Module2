package ClassAndContructor;

import java.util.Scanner;

public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a");
        a = sc.nextDouble();
        System.out.println("Nhap so b");
        b = sc.nextDouble();
        System.out.println("Nhap so c");
        c = sc.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if (qe.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (qe.getDiscriminant() == 0) {
            System.out.println("Co mot nghiem = " + qe.getRoot1());
        } else if (qe.getDiscriminant() > 0) {
            System.out.println("Co nghiem thu nhat = " + qe.getRoot1());
            System.out.println("Co nghiem thu hai = " + qe.getRoot2());
        }
    }
}
