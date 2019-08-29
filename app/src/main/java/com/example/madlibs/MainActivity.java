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
    /*

    public void sendInfo(View v){
        EditText edit = (EditText) findViewById(R.id.myName);
        EditText myAge = (EditText) findViewById(R.id.myAge);

        String myNameStr = myName.getText().toString();
        String myAgeStr = myAge.getText().toString();

        Intent intent = new Intent(this, InfoActivity.class);

        intent.putExtra(InfoActivity.MY_NAME, myNameStr);
        intent.putExtra(InfoActivity.MY_AGE, myAgeStr);

        startActivity(intent);
    }
    */
    
}
