package StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
//        final String palindrome = "Able was I ere I saw Elba";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String palindrome = sc.nextLine();
        Stack<String> stack = new Stack<String>();
        Queue<String> queue = new LinkedList<String>();
        String temp = palindrome.toLowerCase();
        for (int i = 0; i < temp.length(); i++){
            stack.push(String.valueOf(temp.charAt(i)));
            queue.add(String.valueOf(temp.charAt(i)));
        }
        int m = stack.size();
//        System.out.println("Stack");
//        System.out.printf(String.valueOf(stack));
//        System.out.println(" ");
//        System.out.println("Queue");
//        System.out.printf(String.valueOf(queue));
        int count = 0;
        while(!stack.isEmpty()){
            String a = stack.pop();
            String b = queue.remove();
            System.out.printf(a);
            System.out.printf(b);
            System.out.println("");
            if (a == b){
                count++;
            }
        }
        System.out.printf(String.valueOf(count));
        if (count == m){
            System.out.printf("Day la chuoi palindrome ");
        } else
            System.out.printf("Day khong phai la chuoi palindrome ");
    }
}
