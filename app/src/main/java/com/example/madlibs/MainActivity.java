package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        EditText editVerb2 = findViewById(R.id.editVerb2);

        String adjectiveStr = editAdjective.getText().toString();
        String nounStr = editNoun.getText().toString();
        String verbStr = editVerb.getText().toString();
        String nameStr = editName.getText().toString();
        String verb2Str = editVerb2.getText().toString();

        if(adjectiveStr.equals("") || nounStr.equals("") || verbStr.equals("") || nameStr.equals("") || verb2Str.equals("")){
            Toast toast = Toast.makeText(getApplicationContext(), "Please fill out all fields", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }

        Intent intent = new Intent(this, TheLib.class);

        intent.putExtra(TheLib.ADJECTIVE, adjectiveStr);
        intent.putExtra(TheLib.NOUN, nounStr);
        intent.putExtra(TheLib.VERB, verbStr);
        intent.putExtra(TheLib.NAME, nameStr);
        intent.putExtra(TheLib.VERB2, verb2Str);

        startActivity(intent);
    }


}
