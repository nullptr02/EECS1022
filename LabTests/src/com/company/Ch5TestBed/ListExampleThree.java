package com.company.Ch5TestBed;

import java.util.ArrayList;
import java.util.List;

public class ListExampleThree<T> {

    List<T> list = new ArrayList<T>();

    public void addToBag(T t) {

        list.add(t);

    }

    public static void main(String[] args) {

        ListExampleThree t = new ListExampleThree();
        t.addToBag("String");
        t.addToBag(48237894);

        System.out.println(t.toString());




    }
}
