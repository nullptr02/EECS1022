package com.company;

import java.util.Scanner;

public class Labtest2 {

    public static int nFactorial(int x) {

        int result = 1;

        for (int i = 1; i <= x; i++) {

            result *= i;

        }

        return result;

    }

    public static int largestFactor(int x) {

        int result = 1;
        for (int i = 1; i < x; i++) {


            if (x % i == 0) {
                result = i;
            }
        }

        return result;
    }

    public static boolean isPrime(int x) {

        boolean prime = true;
        int y = x / 2;
        for (int i = 2; i <= y; i++) {
            if (x % i == 0) {
                prime = false;

            }
        }

        return prime;
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

    /*
        System.out.print("Please enter a string: ");
        String inputString = s.next();

        System.out.print("Please enter a character in above string: ");
        String charRecognized = s.next();

        System.out.println(inputString + "   " + charRecognized);
        System.out.print("Please enter a number: ");


        int x = s.nextInt();
         System.out.println(nFactorial(x));

    */


        //System.out.println(largestFactor(17));
        //System.out.println(isPrime(19));

        int x = 5;
        int y = 0;
        String w = "4";
        String result;
        try {

            int f = Integer.parseInt(w);
            f = 3 * f;
            result = String.format("%d", f);
            System.out.println(result);


        } catch (Exception e) {

            System.out.println(e.getMessage());
        }


    }

}

