package ca.yorku.eecs.mcalc;

import java.io.PrintStream;
import java.util.Scanner;

public class MortgageModel {

    private double principle;
    private double interest;
    private double amortization;


    public MortgageModel(String p, String a, String i) {

        this.principle = Double.parseDouble(p);
        this.interest = Double.parseDouble(i);
        this.amortization = Double.parseDouble(a);

    }

    public String computePayment() {
        double interest = this.interest/(100*12);
        double amortization = this.amortization*12;
        double index = (this.principle*interest)/(1-(1/(1+(amortization*interest)+ amortization*(amortization-1)*Math.pow(interest,2)/2)));
        String result = String.format("%,.2f", index);

        return result;

    }


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;

        MortgageModel model = new MortgageModel("700000", "25","2.75");
        output.println(model.computePayment());

    }


}
