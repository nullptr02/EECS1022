package ca.yorku.eecs.zero;

import ca.roumani.i2c.Utility;

public class Hello {

    public static void main(String[] args) {
        System.out.println(Math.max(3,5));
        System.out.println(Utility.gcd(24,18));
        System.out.println(Math.pow(2,10));
        System.out.println(Math.sqrt(2));
        System.out.println(Math.sqrt(Math.pow(2,3)));
        System.out.println(Utility.factorial(3));
        System.out.println(Utility.gf(104));

    }
}
