package ca.eecs.caps;

import java.util.List;
import java.util.Map;

import ca.roumani.i2c.*;

public class Game {

    private CountryDB db;


    public Game() {
        this.db = new CountryDB();
    }

    public String qa() {

        List<String> capitals = db.getCapitals();
        int n = capitals.size();
        int x = (int) (n * Math.random());
        String c = capitals.get(x);

        Map<String, Country> data = db.getData();
        Country ref = data.get(c);

        if (Math.random() <0.5){

            String a = "What is the capital of " + c + " ?\n";

            return a;


        } else {

            String b = c + " is the capital of" + " ?\n";


            return b;

        }


    }


    public static void main(String[] args) {

        Game x = new Game();
        System.out.println(x.qa());
    }
}
