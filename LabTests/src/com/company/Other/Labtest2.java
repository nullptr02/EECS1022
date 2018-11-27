package com.company.Other;

public class Labtest2 {


    void newString(String s1, String s2) {


        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int index = s1.indexOf(s2);

        String result = s1.substring(index, s1.length());
        System.out.println(result);

    }

    void countIndexes(String s1, String s2) {

        int index = s1.indexOf(s2);
        System.out.print("Index of s2 in s1: ");


        for (int i = 0; i == index; i++) {
            System.out.print(index + ", ");

        }


        String[] strAry = s1.split(" ");

        for (int i = 0; i < strAry.length; i++) {

            if (s2.equals(strAry[i])) {
                System.out.print(i + ",");
            }
        }

    }

    public static void main(String[] args) {

        String s1 = "The brown cow is brown because mary likes brown cows";
        String s2 = "brown";
        Labtest2 x = new Labtest2();
        //x.newString(s1, s2);
        x.countIndexes(s1, s2);


    }
}
