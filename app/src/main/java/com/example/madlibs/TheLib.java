package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TheLib extends AppCompatActivity {

    public static final String ADJECTIVE = "Adjective";
    public static final String NOUN = "Noun";
    public static final String VERB = "Verb";
    public static final String NAME = "Name";
    public static final String VERB2 = "Verb2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_lib);

        Intent intent = getIntent();
        String adjectiveStr = intent.getStringExtra(ADJECTIVE);
        String nounStr = intent.getStringExtra(NOUN);
        String verbStr = intent.getStringExtra(VERB);
        String nameStr = intent.getStringExtra(NAME);
        String verb2Str = intent.getStringExtra(VERB2);

        String strToDisplay = nameStr + " was excited to " + verbStr + " with their " + adjectiveStr + " " + nounStr +
                ". They were so excited, in fact, that they " + verb2Str;
        TextView str = (TextView) findViewById(R.id.finalLib);
        str.setText(strToDisplay);
    }

    public void shareInfo(View v){
        TextView textLib = findViewById(R.id.finalLib);

        String libStr = textLib.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, libStr);

        String chooserTitle = "Select an app to share to";

        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }
}
