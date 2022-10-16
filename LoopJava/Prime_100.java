package LoopJava;

public class Prime_100 {
    public static void main(String[] args) {
        for (int n = 2; n < 100; n++) {
            boolean flag = true;
            for (int i = 2; i < n-1; i++)
            {
                if (n % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(", " + n);
            }
        }
    }
}
