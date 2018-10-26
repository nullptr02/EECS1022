package ca.eecs.mcalcpro;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Locale;

import ca.roumani.i2c.*;

//
public class MCalcPro_Activity extends AppCompatActivity implements TextToSpeech.OnInitListener, SensorEventListener {




    public void buttonClicked(View v) {

        try {

            MPro mp = new MPro();
            mp.setPrinciple("400000");
            mp.setAmortization("20");
            mp.setInterest("5");

            String s = "Monthly Payment = " + mp.computePayment("%,.2f");
            s += "\n\n";
            s += "By making this payments monthly for ";
            s += "\n\n";

            s += String.format("%8d", 0) + mp.outstandingAfter(0, "%,16.0f");
            s += "\n\n";
            s += String.format("%8d", 1) + mp.outstandingAfter(0, "%,16.0f");
            s += "\n\n";

            System.out.println(s);
        } catch (
                Exception e)

        {

            Toast label = Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT);
            label.show();


        }


        View principleView = findViewById(R.id.pBox);
        EditText pEdit = (EditText) principleView;
        String principle = pEdit.getText().toString();
        String amortization = ((EditText) findViewById(R.id.aBox)).getText().toString();
        String interest = ((EditText) findViewById(R.id.iBox)).getText().toString();


        MPro mp = new MPro();
        mp.setPrinciple(principle);
        mp.setAmortization(amortization);
        mp.setInterest(interest);



    }



    private TextToSpeech tts;





    public static void main(String[] args) {



    }

    public void onAccuracyChanged(Sensor arg0, int arg1) {


    }

    public void onSensorChanged(SensorEvent event) {

        double ax = event.values[0];
        double ay = event.values[1];
        double az = event.values[2];
        double a = Math.sqrt(ax * ax * +ay * ay + az * az);

        if (a > 20) {
            ((EditText) findViewById(R.id.pBox)).setText("");
            ((EditText) findViewById(R.id.aBox)).setText("");
            ((EditText) findViewById(R.id.iBox)).setText("");
            ((TextView) findViewById(R.id.output)).setText("");
        }


    }


    public void onInit(int initStatus) {
        this.tts.setLanguage(Locale.US);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        this.tts = new TextToSpeech(this, this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mcalcpro_layout);
    }


}
