package com.example.android.adarkknightquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        int scoreNum = getIntent().getIntExtra("result", 0);

        TextView score = findViewById(R.id.score);
        TextView message = findViewById(R.id.message);

        HashMap<Integer, String> messages = new HashMap<Integer, String>();
        messages.put(0, "Doesn't take the World's Greatest Detective to know that you're clueless");
        messages.put(1, "Someone doesn't know much about Batsy...");
        messages.put(2, "It seems as though you've only seen the Caped Crusader in film");
        messages.put(3, "You're pretty familiar with the better half of the Dynamic Duo");
        messages.put(4, "You must have read a Batman comic or two in your day");
        messages.put(5, "Congratulations, you are a true fan of the Dark Knight");

        Log.v("Hash value", "HELLO?" + messages.get(scoreNum));
        score.setText(scoreNum + "");
        message.setText(messages.get(scoreNum));
    }
}
