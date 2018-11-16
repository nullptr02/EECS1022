package com.company.Ch4Methods;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {

    public static void main(String[] args) {

        int n = 125;
        String s = "" + n;
        String t = String.format("%d", n);

        String z = "125";
        int b = Integer.parseInt(z);
        int c = b * 5;

        System.out.println(t);
        System.out.println(c);

        String a = "HELLO";
        String d = "HELLO";

        boolean result;
        result = a.equalsIgnoreCase(d);
        System.out.println(a.equalsIgnoreCase(d));

        result = a.equals(d);
        System.out.println(result);


        System.out.println(a.compareTo(d));

        String ab = "Hello";

        int count = 0;
        for (int position = 0; position < s.length(); position++) {
            String cd = ab.substring(position, position + 1);

            if (cd.equals("e")) {
                count++;
            }
        }

        System.out.println(count);


        int counter = 0;
        for (int p = ab.indexOf("e"); p != -1; p = s.indexOf("e")) {
            counter++;
            ab = ab.substring(p + 1, ab.length());
        }

        System.out.println(counter);

        String xyz = "Torotno";

        System.out.println(xyz.indexOf("n"));
        System.out.println(xyz.replace("n", "N"));

        String abc = "alsjdnakljsfnkjadns Toronto torontO";
        String regex = ("T[a-z]*o");

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(abc);

        while (matcher.find()) {
            System.out.println(abc.substring(matcher.start(), matcher.end()));
        }

        String xyzb = "What is the flux capacitor";
        String regexSquared = ("[A-Za-z]+");

        Pattern p = Pattern.compile(regexSquared);
        Matcher m = p.matcher(xyzb);

        while(m.find()){
            System.out.println(xyzb.substring(m.start(),m.end()));
        }

        String regexUpdate = ("[f][l][u][x]");
        String fixed = xyzb.replaceAll(regexUpdate,"the");

        System.out.println(fixed);
    }
}
