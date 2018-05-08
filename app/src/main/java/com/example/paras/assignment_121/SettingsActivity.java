package com.example.paras.assignment_121;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


// a class extending the AppCompatActivity
public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {    // onCreate method.
        super.onCreate(savedInstanceState);
        // setting the layout of this activity as activity_settings where the Linear layout exists to display the preference_screen_layout inside it.
        setContentView(R.layout.activity_settings);

        // creating the object of the SettingsScreen class mentioned below of type Fragment.
        Fragment fragment = new SettingsScreen();
        // creating the object of the FragmentTransaction and starting the Transaction using the fragment manager.
        FragmentTransaction ftr = getFragmentManager().beginTransaction();

        // if we are opening the app for the first time then this condition satisfies.
        if (savedInstanceState == null) {
            // add the preference_screen_layout inside the Linear Layout and commit the transaction.
            ftr.add(R.id.linear_layout_settings,fragment,"preference_screen_layout");
            ftr.commit();
        }
        // if we have earlier made some changes in the app then.
        else {
            // set the fragment using the fragment manager that has the following mentioned tag.
            fragment.getFragmentManager().findFragmentByTag("preference_screen_layout");
        }
    }  //SettingsActivity class ends.


// a class extending PreferenceFragment for making the fragment that we see inside the Linear Layout.
    public static class SettingsScreen extends PreferenceFragment {
        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {     // onCreate method.
            super.onCreate(savedInstanceState);
            // adding the preference screen from the following resource in the xml directory created before.
            addPreferencesFromResource(R.xml.preference_screen_layout);
        }
    }
}// SettingsScreen ends.
