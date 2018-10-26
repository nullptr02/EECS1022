package ca.eecs.bmi;

import static ca.roumani.i2c.Utility.m2FtInch;

public class BMIModel {

    private double weight;
    private double height;


    public BMIModel(String w, String h) {

        this.weight = Double.parseDouble(w);
        this.height = Double.parseDouble(h);
    }

    public String getBMI() {
        double index = this.weight / (this.height * this.height);
        String result = String.format("%.2f", index);

        return result;
    }

    public String toPound() {

        double kgsToPound = this.weight / 0.454;
        String result = String.format("%.2f", kgsToPound);
        return result;

    }

    public String toFeetInch() {

        return m2FtInch(this.height);
    }


    public static void main(String[] args) {

        //Test1
        BMIModel myModel = new BMIModel("90", "1.8");
        System.out.println(myModel.getBMI());

        //Test2
        myModel = new BMIModel("220", "1.8");
        System.out.println(myModel.getBMI());

        //Test3
        myModel = new BMIModel("150", "2.0");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("77", "1.8");
        System.out.println("Return to pound: " + myModel.toPound());

        myModel = new BMIModel("77","1.78");
        System.out.println("Return height in feet: " + myModel.toFeetInch());

    }

}




