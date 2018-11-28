package com.company.Ch5TestBed;

import java.util.*;

public class ListExampleTwo {


    public static boolean addIfNew(List<Integer> bag, Integer s) {

        boolean result = !bag.contains(s);
        if (result) {
            bag.add(s);
        }
        return result;
    }

    public static void display(List<Integer> bag, double avg) {
        for (Integer i : bag) {
            System.out.println(i);
        }
        System.out.println("Size of bag: " + bag.size());
        Collections.sort(bag);
        System.out.println("Sort ASC: " + bag);
        Collections.sort(bag, Collections.reverseOrder());
        System.out.println("Sort DESC: " + bag);
        System.out.println("Avg of List: " + avg);
        //System.out.println("toString: " + bag.toString());

    }

    public static double average(List<Integer> bag) {
        double avg = 0;
        int sizeOfList = bag.size();

        for (Integer i : bag) {
            avg += i;
        }

        return avg / sizeOfList;


    }

    public static List<Integer> addNewElement(List<Integer> bag, Integer x) {
        boolean result = !bag.contains(x);

        if (result) {
            bag.add(x);
        }

        return bag;
    }

    public static List<Integer> addInts(List<Integer> bag) {

        int max = 100;
        int min = 1;
        int range = max - min + 1;

        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            bag.add(rand);
        }

        return bag;

    }

    public static void main(String[] args) {

        List<Integer> x = new ArrayList<>();

        double avg;
        int y = 1234567890;
        x = addInts(x);
        avg = average(x);
        display(x, avg);
        addNewElement(x, y);
        System.out.println("\n\nAfter addNewElement Method: ");
        for (Integer index : x) {
            System.out.println(index);
        }

    }
}
