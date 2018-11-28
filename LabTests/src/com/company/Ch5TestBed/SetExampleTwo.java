package com.company.Ch5TestBed;

import java.util.Set;
import java.util.TreeSet;

public class SetExampleTwo {

    public static void StringFun() {

        Set<String> bag = new TreeSet<>();
        bag.add("Toronto");
        bag.add("Toronto");
        bag.add("If you like Geeks for Geeks and would like to contribute");
        bag.add("LA");

        for (String i : bag){
            System.out.println(i);
        }



    }

    public static void main(String[] args) {

        StringFun();

    }
}
