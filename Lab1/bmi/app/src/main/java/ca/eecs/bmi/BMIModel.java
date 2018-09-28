package ca.eecs.bmi;

import java.io.PrintStream;
import java.util.Scanner;

import ca.roumani.i2c.Utility;

public class BMIModel {
    private double weight;
    private double height;

    public BMIModel(String w, String h) {
        this.weight = Double.parseDouble(w);
        this.height = Double.parseDouble(h);
    }

    public String getBMI() {
        double index = this.weight / (this.height * this.height);
        String result = String.format("%.1f", index);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;

        BMIModel model = new BMIModel("152", "1.5");
        output.println(model.getBMI());

        model = new BMIModel("54", "1.53");
        output.println(model.getBMI());

        model = new BMIModel("66", "1.8");
        output.println(model.getBMI());

        model = new BMIModel("100", "1.4");
        output.println(model.getBMI());
    }

    public String toFeetInch() {

        return Utility.m2FtInch(height);

    }


    public String toPound() {
        float pounds = (float) Math.round(weight / 0.454);
        String result = String.format("%.1f", pounds);

        return result;
    }
}