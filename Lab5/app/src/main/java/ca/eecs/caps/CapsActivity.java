package ca.eecs.caps;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class CapsActivity extends AppCompatActivity {


    private Game game = new Game();
    private String question;
    private String userAnswer;
    private String correctAnswer;
    private int score;
    private int qNum;
    private ToneGenerator tg = new ToneGenerator(AudioManager.STREAM_ALARM,100);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caps_layout);
        this.correctAnswer = "";
        this.score = 1;
        this.qNum = 0;
        this.ask();

        this.tg = new ToneGenerator(AudioManager.STREAM_ALARM, 100);

        //Increment the question number
        String qNumString = ((TextView) findViewById(R.id.qNum)).getText().toString();
        String t = qNumString.substring(0, 2) + qNum;
        ((TextView) findViewById(R.id.qNum)).setText(t);
    }

    private void ask() {

        question = game.qa();

        //Generate a new question and split the question into two strings.
        //One for the question and one for the answer
        String[] splitString = question.split("\n");

        //Assign each split string to their appropriate variables
        this.question = splitString[0];
        this.correctAnswer = splitString[1];


        //Set the question to the view
        ((TextView) findViewById(R.id.question)).setText(question);

        //Increment the question number
        String qNumString = ((TextView) findViewById(R.id.qNum)).getText().toString();
        String t = qNumString.substring(0, 2) + qNum++;
        ((TextView) findViewById(R.id.qNum)).setText(t);


    }

    public void onDone(View v) {


        //Save the Users Answer
        userAnswer = ((EditText) findViewById(R.id.answer)).getText().toString();


        //If the users answer is correct
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {

            tg.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 200);
            //Increment score
            String scoreStr = ((TextView) findViewById(R.id.score)).getText().toString();
            String x = scoreStr.substring(0, 8) + score++;
            ((TextView) findViewById(R.id.score)).setText(x);


            //Increment the question number
            String qNumString = ((TextView) findViewById(R.id.qNum)).getText().toString();
            String t = qNumString.substring(0, 2) + qNum;
            ((TextView) findViewById(R.id.qNum)).setText(t);


        } else {

            //Increment the question number
            String qNumString = ((TextView) findViewById(R.id.qNum)).getText().toString();
            String t = qNumString.substring(0, 2) + qNum;
            ((TextView) findViewById(R.id.qNum)).setText(t);

            tg.startTone(ToneGenerator.TONE_CDMA_ANSWER, 200);



        }
        if (qNum == 11) {
            //If the game is over end the game and display score
            String end = "Game Over";
            ((TextView) findViewById(R.id.qNum)).setText(end);
            finish();
        }

        //Running log
        String old = ((TextView) findViewById(R.id.log)).getText().toString();
        String runningLog = "Q#" + qNum + ": " + question + '\n' + "Your answer: " + userAnswer +
                '\n' + "Correct Answer: " + correctAnswer;
        ((TextView) findViewById(R.id.log)).setText(runningLog + '\n' + '\n' +  old);

        if (qNum < 11) {

            ((EditText) findViewById(R.id.answer)).setText("");
            ask();
        }


    }


}
