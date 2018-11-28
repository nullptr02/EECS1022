package com.company.Ch5TestBed;

import java.util.*;

public class SetExampleOne {

    public static Set<Integer> removeDuplicates(List<Integer> list) {

        Set<Integer> result = new TreeSet<Integer>();
        for (Integer i : list) {
            result.add(i);
        }

        return result;
    }

    public static List<Integer> add(List<Integer> bag, int x) {
        bag.add(x);
        return bag;
    }

    public static void main(String[] args) {

        List<Integer> x = new ArrayList<>();
        Set<Integer> ab;
        int a = 10;
        int y = 10;
        int z = 01;
        add(x, a);
        add(x, y);
        add(x, z);

        removeDuplicates(x);
        for (Integer i : x) {

            System.out.println(i);
        }

        System.out.println("\n\n");

        ab = removeDuplicates(x);
        for (Integer i : ab) {
            System.out.println(i);
        }


    }
}
