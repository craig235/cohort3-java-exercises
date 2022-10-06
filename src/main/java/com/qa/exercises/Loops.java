package com.qa.exercises;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Sum is: " + sumDigits(1234));
        System.out.println("Sum is: " + sumDigits(5681));
        System.out.println("Reverse is: " + reverseNumber(1234));
        System.out.println("Reverse is: " + reverseNumber(879));
    }

    private static int reverseNumber(int number) {
        int rev_num = 0;
        while (number != 0) {
            rev_num = (rev_num * 10) + number % 10;
            number /= 10;
        }
        return rev_num;
    }

    private static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
