package com.example.android.adarkknightquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score = 0;
    private RadioGroup question1;
    private RadioGroup question2;
    private RadioGroup question3;
    private RadioGroup question4;
    private RadioGroup question5;
    private RadioButton answer1;
    private RadioButton answer2;
    private RadioButton answer3;
    private RadioButton answer4;
    private RadioButton answer5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question1 = findViewById(R.id.question1);
        question2 = findViewById(R.id.question2);
        question3 = findViewById(R.id.question3);
        question4 = findViewById(R.id.question4);
        question5 = findViewById(R.id.question5);

        answer1 = findViewById(R.id.one_4);
        answer2 = findViewById(R.id.two_1);
        answer3 = findViewById(R.id.three_1);
        answer4 = findViewById(R.id.four_5);
        answer5 = findViewById(R.id.five_2);

        score = 0;
    }

    public void submit(View view) {
        score = 0;
        checkAnswer(question1.getCheckedRadioButtonId(), answer1.getId());
        checkAnswer(question2.getCheckedRadioButtonId(), answer2.getId());
        checkAnswer(question3.getCheckedRadioButtonId(), answer3.getId());
        checkAnswer(question4.getCheckedRadioButtonId(), answer4.getId());
        checkAnswer(question5.getCheckedRadioButtonId(), answer5.getId());
        Toast.makeText(this, "Your Score is " + score + "/5", Toast.LENGTH_LONG).show();
    }

    public void checkAnswer(int choice, int answer) {
        if (choice == answer) {
            score++;
        }

        /*
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_pirates:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radio_ninjas:
                if (checked)
                    // Ninjas rule
                    break;
        }*/
    }
}
