package com.company.Ch5TestBed;

import java.util.ArrayList;
import java.util.*;

public class ListExampleOne {

    public static List<String> add() {

        List<String> bag = new ArrayList<String>();

        bag.add("Canada");
        bag.add("USA");
        bag.add("Italy");
        bag.add("Portugal");

        System.out.println("Before Adding: ");

        for (String i : bag){
            System.out.println(i);
        }

        return bag;
    }

    public static boolean addIfNew(List<String> bag, String s){

        boolean result = !bag.contains(s);

        if (result){
            bag.add(s);
        }

        return result;
    }

    public static void display(List<String> x){

        System.out.println("\nAfter adding: ");

        for (String i: x){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {

        List<String> x;
        String z = "Germany";
        x = add();
        addIfNew(x, z);
        display(x);

    }


}
