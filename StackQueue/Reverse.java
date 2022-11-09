package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void Reverse_Int() {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> temp = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu cua Stack: ");
        n = Integer.parseInt(sc.nextLine());
        while (stack.size() < n) {
            int index;
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap phan tu thu : " + (i + 1) + " cua stack");
                index = Integer.parseInt(sc.nextLine());
                stack.push(index);
            }
        }
        while (!stack.isEmpty()) {
            temp.push(stack.peek());
            stack.pop();
        }
        System.out.print("Stack sau khi dao nguoc la " + temp);
    }

    public static void Reverse_String() {
        Stack<String> stack = new Stack<String>();
        Stack<String> temp = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String n = sc.nextLine();
        String[] words = n.split(" ");
        for (String w : words) {
            stack.push(w);
        }
//        System.out.print(stack);
        while (!stack.isEmpty()) {
            temp.push(stack.peek());
            stack.pop();
        }
        Object[] arr = temp.toArray();

        System.out.println("dao chuoi la :");
        for (int j = 0; j < arr.length; j++)
            System.out.print(arr[j] + " ");
    }

    public static void main(String[] args) {
//        Reverse_Int();
        Reverse_String();
    }
}
