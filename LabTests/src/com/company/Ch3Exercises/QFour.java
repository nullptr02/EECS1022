package com.company.Ch3Exercises;

public class QFour {


    public static double moviePrice(int age, String dayCode) {
        String x = "W";
        double price;
        if (dayCode.equals(x)) {
            price = 8;

        } else if (age < 10) {
            price = 8;

        } else if (age > 10 && age < 17) {
            price = 10;

        } else if (age < 60) {
            price = 10;

        } else {
            price = 12;
        }

        return price;

    }


    public static void main(String[] args) {
        QFour i = new QFour();
        System.out.println(i.moviePrice(10,"W"));

    }
}
