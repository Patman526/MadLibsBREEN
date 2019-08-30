package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo(View v){
        EditText editAdjective = findViewById(R.id.editAdjective);
        EditText editNoun = findViewById(R.id.editNoun);
        EditText editVerb = findViewById(R.id.editVerb);
        EditText editName = findViewById(R.id.editName);

        String adjectiveStr = editAdjective.getText().toString();
        String nounStr = editNoun.getText().toString();
        String verbStr = editVerb.getText().toString();
        String nameStr = editName.getText().toString();

        Intent intent = new Intent(this, TheLib.class);

        intent.putExtra(TheLib.ADJECTIVE, adjectiveStr);
        intent.putExtra(TheLib.NOUN, nounStr);
        intent.putExtra(TheLib.VERB, verbStr);
        intent.putExtra(TheLib.NAME, nameStr);

        startActivity(intent);
    }


}
