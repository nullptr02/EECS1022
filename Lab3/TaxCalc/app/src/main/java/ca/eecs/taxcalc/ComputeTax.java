package ca.eecs.taxcalc;

public class ComputeTax {

    //TAX PERCENTAGE CONSTANTS
    final double taxPercent2 = 22.79;
    final double taxPercent3 = 33.23;
    final double taxPercent4 = 45.93;
    final double taxPercent5 = 52.75;

    //TAX BRACKET CONSTANTS
    final double taxBracket1 = 11475;
    final double taxBracket2 = 33808;
    final double taxBracket3 = 40895;
    final double taxBracket4 = 62823;


    //Private Variables
    private double clIncome;


    //One-arg Constructor
    public ComputeTax(double income) {
        setClIncome(income);
    }

    //Getter
    public double getClIncome() {

        return clIncome;
    }

    //Setter
    public void setClIncome(double income) {
        this.clIncome = income;
    }

    public void computeIncomeTax() {
        double income = getClIncome();


        if (income > taxBracket1) {
            income -= taxBracket1;
        } else if (income > taxBracket1 && income > taxBracket2) {

            income -= taxBracket2;

        }else if (income > taxBracket3) {
            income -= taxBracket3;

        }else if (income > taxBracket4) {
            income -= taxBracket4;
        }
    }


}
