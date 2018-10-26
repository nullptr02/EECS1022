package ca.eecs.tabulate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


public class TabulateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabulate);
    }


    public void onClick(View v){
        ScrollView sv = (ScrollView) findViewById(R.id.sv);
        sv.removeAllViews();

        TableLayout tl = new TableLayout(this);
        sv.addView(tl);

        TableRow row = new TableRow(this);
        row.setGravity(Gravity.CENTER_HORIZONTAL);
        tl.addView(row);

        TextView tv = new TextView(this);
        tv.setGravity(Gravity.CENTER_HORIZONTAL);
        tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,32);

        tv.setText("Hello!");
    }
}
