package com.company.Ch3Exercises;

import java.util.Scanner;

public class QThree {

    public int sumSquares(int a, int b) {
        int firstNum = a;
        int secondNum = b;
        int result = 0;
        for (int i = firstNum; i <= secondNum; i++) {

            result += i * i;

        }

        return result;


    }

    public static void main(String[] args) {

        QThree i = new QThree();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(i.sumSquares(x,y));
    }
}
