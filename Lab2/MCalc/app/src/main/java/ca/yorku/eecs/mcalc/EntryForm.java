package ca.yorku.eecs.mcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EntryForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
    }



    public void buttonClicked(View v) {


        View principleView = findViewById(R.id.principleBox);
        EditText principleEdit = (EditText) principleView;
        String principle = principleEdit.getText().toString();
        String amortization = ((EditText) findViewById(R.id.amortizationBox)).getText().toString();
        String interest = ((EditText) findViewById(R.id.interestBox)).getText().toString();

        MortgageModel model = new MortgageModel(principle, amortization, interest );
        String answer = "$" + model.computePayment();

        ((TextView) findViewById(R.id.answer)).setText(answer);


    }

    public void buttonClicked2(View v)
    {
        View principleView = findViewById(R.id.principleBox);
        EditText principleEdit = (EditText) principleView;
        String principle = principleEdit.getText().toString();
        String amortization = ((EditText) findViewById(R.id.amortizationBox)).getText().toString();
        String interest = ((EditText) findViewById(R.id.interestBox)).getText().toString();

        MortgageModel model = new MortgageModel(principle, amortization, interest );

        int x = 20 * 12;
        String answer2 = "$" + model.outstandingAfter(x);

        ((TextView) findViewById(R.id.answer2)).setText(answer2);

    }

}
