package com.example.paras.assignment_121;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


// a class extending the AppCompatActivity
public class ShowData extends AppCompatActivity {
    // creating the three TextView instances where the data stored in Shared Preferences will be displayed.
    TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {        //onCreate method.
        super.onCreate(savedInstanceState);
        // setting the layout of this activity as activity_show_data where three TextViews are there.
        setContentView(R.layout.activity_show_data);
        // creating the instance of the TextViews on the ShowData activity.
        tv1 = (TextView) findViewById(R.id.passwordTextView);
        tv2 = (TextView) findViewById(R.id.screenLockTextView);
        tv3 = (TextView) findViewById(R.id.reminderTextView);

        // creating the object of the shared preferences using the preference manager,
        // pass inside it the base context of the current activity.
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        // storing inside variables of respective datatypes of the values of the keys passed.
        // also telling the default values of the variables as mentioned if the value of the respective key is null.
        String password = sp.getString("passwordKey","No Text Data");
        boolean screenLock = sp.getBoolean("screeLockKey",false);
        String reminder = sp.getString("reminderForUpdationKey","No Updates Reminder");

        // setting the text inside the text views as the text stored in the variables above.
        tv1.setText("Password:         "+password);
        tv2.setText("Screen Lock:   "+screenLock);
        tv3.setText("Updation:         "+reminder);

    }
}   // ShowData class ends.
