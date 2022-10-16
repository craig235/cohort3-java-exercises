package com.qa.fundamentals;

public class ReverseNumber {
    public static void main(String[] args) {
        new ReverseNumber().run();
    }

    public void run() {
        int number = 1234;
        System.out.printf("Digits: %d. Reverse is: %d%n", number, reverseNumber(number));

        number = 879;
        System.out.printf("Digits: %d. Reverse is: %d%n", number, reverseNumber(number));
    }

    private static int reverseNumber(int number) {
        int rev_num = 0;
        while (number != 0) {
            rev_num = (rev_num * 10) + number % 10;
            number /= 10;
        }
        return rev_num;
    }
}
