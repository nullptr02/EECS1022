package com.company.Ch3Exercises;

public class QSix {

    public int calc(int a, int b) {
        int numberOne = a;
        int numbertwo = b;
        int result = 0;

        for (int i = a; Math.sqrt(i) ==0; i++) {
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        QSix i = new QSix();
        System.out.println(i.calc(4,15));
    }

}
