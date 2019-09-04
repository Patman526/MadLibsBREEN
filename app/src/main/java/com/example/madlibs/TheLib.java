package com.example.madlibs;

import android.content.Intent;
import android.support.v4.text.HtmlCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

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

        String output = "<b>" + nameStr + "</b> was excited to <b>" + verbStr + "</b> with their <b>" +
                adjectiveStr + "</b> <b>" + nounStr + "</b>. They were so excited to <b>" + verbStr +
                "</b>, in fact, that they <b>" + verb2Str + "</b>";

        Spanned string = HtmlCompat.fromHtml(output, 0);

        TextView str = findViewById(R.id.finalLib);
        str.setText(string);
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
