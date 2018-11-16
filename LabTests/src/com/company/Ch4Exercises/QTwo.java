package com.company.Ch4Exercises;


public class QTwo {

    public static String say(int n) {

        String zero = "ZERO";
        String one = "ONE";
        String two = "TWO";
        String three = "THREE";
        String four = "FOUR";
        String five = "FIVE";
        String six = "SIX";
        String seven = "SEVEN";
        String eight = "EIGHT";
        String nine = "NINE";

        String result = "";

        if (n == 0) {
            result += zero;
        }
        return result;

    }

    public static void main(String[] args) {
        QTwo i = new QTwo();
        System.out.println(i.say(0));
    }


}
