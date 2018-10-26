package ca.eecs.tabulate;

import java.sql.SQLOutput;

public class PowerOfSquares {


    private int userInput;
    private double squareResult;
    private double squareRootResult;


    PowerOfSquares(int u) {
        if (u < 1) {
            System.out.println("Negative number detected\nUsing Absolute Value of inputted value");
            Math.abs(u);
        } else {
            this.userInput = u;
        }
    }

    public void computeSquare(int u) {
        for (int i = 1; i <= u; i++) {
            System.out.print(i + "\t");
            System.out.println(Math.pow(i, 2));
        }
    }

    public void computeSquareRoot(int u) {
        for (int i = 1; i <= u; i++) {
            System.out.print(i + "\t");
            System.out.println(Math.sqrt(i));
        }
    }


    public static void main(String[] args) {
        PowerOfSquares x = new PowerOfSquares(-20);
        x.computeSquare(50);
        x.computeSquareRoot(50);

    }


}
