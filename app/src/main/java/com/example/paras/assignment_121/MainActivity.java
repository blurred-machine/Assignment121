package com.example.paras.assignment_121;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


// Main class extending the AppCompatActivity
public class MainActivity extends AppCompatActivity {

    // creating the two button instances
    Button saveBtn, showBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {      //onCreate method.
        super.onCreate(savedInstanceState);
        // setting the layout of this activity as activity_main where two buttons are there.
        setContentView(R.layout.activity_main);
        // creating the instance of the buttons on the main activity.
        saveBtn = (Button) findViewById(R.id.button1);
        showBtn = (Button) findViewById(R.id.button2);
    }

    // method called when settings button is pressed once.
    public void storeDataEntered(View view) {
        // on clicking the button intent is fired to the SettingsActivity.java.
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);  // fires the intent.
    }

    // method called when show data button is pressed once.
    public void showDataCreated(View view) {
        // on clicking the button intent is fired to the ShowData.java activity.
        Intent intent = new Intent(this, ShowData.class);
        startActivity(intent);  // fires the intent.
    }
}   // MainActivity class ends.
