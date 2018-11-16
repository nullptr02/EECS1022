package com.company.Ch3Exercises;

public class QFive {

    public static int factorial(int n) {

        int result = 1;


        if (n < 0) {
            throw new RuntimeException("Can't be a negative number!");
        }

        if (n <= 0 || n >= 12) {
            throw new RuntimeException("Can't be a greater than 12!");
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }


        return result;
    }

    public static void main(String[] args) {

        QFive i = new QFive();
        System.out.println(i.factorial(4));

    }
}
