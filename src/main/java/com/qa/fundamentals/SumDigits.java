package com.qa.fundamentals;

public class SumDigits {

    public static void main(String[] args) {
        new SumDigits().run();
    }

    public void run() {
        int digits = 1234;
        System.out.printf("Digits: %d. Sum is: %d%n", digits, sumDigits(digits));

        digits = 5681;
        System.out.printf("Digits: %d. Sum is: %d%n", digits, sumDigits(digits));
    }

    public int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
