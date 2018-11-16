package com.company.Ch4Exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QSix {


    public int telCount(String s) {
        int i = 0;

        String regex = "[4,6,2,9][1,4,0,8][6,8,7,5][-]?[0-9][0-9][0-9][-]?[0-9][0-9][0-9][0-9]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while (m.find()) {
            System.out.println(s.substring(m.start(), m.end()));
        }

        return i;
    }

    public static void main(String[] args) {
        String s = "416399576698798798hnik905-851-5834  647-274-5583";

        QSix i = new QSix();
        i.telCount(s);
    }
}
