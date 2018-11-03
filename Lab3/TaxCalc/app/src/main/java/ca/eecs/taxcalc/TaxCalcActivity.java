package ca.eecs.taxcalc;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import ca.roumani.i2c.MPro;


public class TaxCalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax_calc);
    }


    public void buttonClicked(View v){


        EditText incomeView = (EditText) findViewById(R.id.income);
        String income = incomeView.getText().toString();



        ScrollView sv = (ScrollView) findViewById(R.id.sv);

        LinearLayout output = new LinearLayout(this);
        output.setOrientation(LinearLayout.VERTICAL);
        sv.addView(output);

        output.removeAllViews();

        TextView tv = new TextView(this);
        tv.setGravity(Gravity.CENTER_HORIZONTAL);
        tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,32);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setText("Hello!");
        output.addView(tv);

    }
}
