package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TheLib extends AppCompatActivity {

    public static final String ADJECTIVE = "adjective";
    public static final String NOUN = "Noun";
    public static final String VERB = "verb";
    public static final String NAME = "Name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_lib);

        Intent intent = getIntent();
        String adjectiveStr = intent.getStringExtra(ADJECTIVE);
        String nounStr = intent.getStringExtra(NOUN);
        String verbStr = intent.getStringExtra(VERB);
        String nameStr = intent.getStringExtra(NAME);

        String strToDisplay = "";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
    }
}
