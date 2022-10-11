package IntroductiontoJava;

import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        String result = "";
        do {
            System.out.println("Enter number: ");
            number = sc.nextInt();
        } while (number < 0 || number > 999);
        int digit = number % 10;
        int ten = (number % 100) / 10;
        int hundred = number / 100;
        switch (hundred) {
            case 0:
                result += "";
                break;
            case 1:
                result += "One hundred ";
                break;
            case 2:
                result += "Two hundred ";
                break;
            case 3:
                result += "Three hundred ";
                break;
            case 4:
                result += "Four hundred ";
                break;
            case 5:
                result += "Five hundred ";
                break;
            case 6:
                result += "Six hundred ";
                break;
            case 7:
                result += "Seven hundred ";
                break;
            case 8:
                result += "Eight hundred ";
                break;
            case 9:
                result += "Nine hundred ";
                break;
        }
        if (hundred != 0 && (ten != 0 || digit != 0))
            result += "and ";
        switch (ten) {
            case 0:
                result += "";
                break;
            case 1: {
                switch (digit) {
                    case 0:
                        result += "ten";
                        break;
                    case 1:
                        result += "eleven";
                        break;
                    case 2:
                        result += "twelve";
                        break;
                    case 3:
                        result += "thirteen";
                        break;
                    case 4:
                        result += "fourteen";
                        break;
                    case 5:
                        result += "fifteen";
                        break;
                    case 6:
                        result += "sixteen";
                        break;
                    case 7:
                        result += "seventeen";
                        break;
                    case 8:
                        result += "eighteen";
                        break;
                    case 9:
                        result += "nineteen";
                        break;
                }
                break;
            }
            case 2:
                result += "twenty ";
                break;
            case 3:
                result += "thirty ";
                break;
            case 4:
                result += "forty ";
                break;
            case 5:
                result += "fifty ";
                break;
            case 6:
                result += "sixty ";
                break;
            case 7:
                result += "seventy ";
                break;
            case 8:
                result += "eighty ";
                break;
            case 9:
                result += "ninety ";
                break;
        }
        if (ten != 1) {
            switch (digit) {
                case 0: {
                    {
                        if (hundred == 0 && ten == 0) result = "zero";
                    }
                }
                break;
                case 1:
                    result += "one";
                    break;
                case 2:
                    result += "two";
                    break;
                case 3:
                    result += "three";
                    break;
                case 4:
                    result += "four";
                    break;
                case 5:
                    result += "five";
                    break;
                case 6:
                    result += "six";
                    break;
                case 7:
                    result += "seven";
                    break;
                case 8:
                    result += "eight";
                    break;
                case 9:
                    result += "nine";
                    break;
            }
        }
        System.out.println(result);
    }
}
