package com.company.Ch4Methods;

import java.util.HashMap;
import java.util.Map;

public class StringFun {

    public static void printDuplicte(String s1) {

        char[] characters = s1.toCharArray();
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();
        for (Character i: characters){
            if (charMap.containsKey(i)){
                charMap.put(i,charMap.get(i)+1);
            }else{
                charMap.put(i,1);
            }
        }

        for (Character i: characters){
            if (i)
            System.out.println();
        }

    }

    public static void main(String[] args) {

        printDuplicte("Java");

    }
}


