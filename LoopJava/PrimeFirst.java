package LoopJava;

public class PrimeFirst {
    public static void main(String[] args) {
        int count = 1;
        for (int n = 2; count <= 20; n++) {
            boolean flag = true;
            if (n == 2) {
                flag = true;
            } else if (n % 2 == 0) {
                flag = false;
            } else {
                for (int i = 3; i <= (int) Math.sqrt(n); i += 2)
                {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag == true) {
                System.out.print(", " + n);
                count++;
            }
        }
    }
}
