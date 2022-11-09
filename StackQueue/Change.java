package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Change {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so can chuyen tu thap phan sang nhi phan: ");
        n = Integer.parseInt(sc.nextLine());
        while (n > 0){
                stack.push(n%2);
                n /= 2;
        }
        while (!stack.isEmpty()){
                System.out.print(stack.pop());
        }
    }
}
