package ca.eecs.caps;

import java.util.List;
import java.util.Map;
import java.util.Random;

import ca.roumani.i2c.*;

public class Game {

    private CountryDB db;


    public Game() {
        this.db = new CountryDB();
    }

    public String qa() {

        List<String> capitals = db.getCapitals();
        int n = capitals.size();
        int index = (int) (Math.random() * n);
        String c = capitals.get(index);
        //System.out.println(c);

        Map<String, Country> data = db.getData();
        Country ref = data.get(c);
        //System.out.println(ref.toString());

        if (Math.random() < 0.5) {
            String a = "What is the capital of " + ref.getName() + "?" + "\n" + c;
            return a;
        } else {
            String b = c + " is the capital of " + " ?\n" + ref.getName();
            return b;
        }
    }


    public static void main(String[] args) {

        Game x = new Game();
        System.out.println(x.qa());
    }
}
