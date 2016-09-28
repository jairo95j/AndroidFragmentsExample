package com.example.jimenez.jairo.androidfragmentsexample;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Creates a FragmentManager that manages the fragments associates with it
       android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

        //beginTransaction() starts a series of edit operations on the Fragments
        // associated with the FragmentManager
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //configInfo is to get the configuration information of the device
        Configuration configInfo = getResources().getConfiguration();

        //Checks the orientation of the device
        if(configInfo.orientation == Configuration.ORIENTATION_LANDSCAPE) {

            //Creates a new FragmentLandscape object
            FragmentLandscape fragmentLandscape = new FragmentLandscape();

            //Replaces an existing fragment that was added to the container
            fragmentTransaction.replace(android.R.id.content, fragmentLandscape);

        } else {

            //Creates a new FragmentPortrait object
            FragmentPortrait fragmentPortrait = new FragmentPortrait();

            //Replaces an existing fragment that was added to the container
            fragmentTransaction.replace(android.R.id.content, fragmentPortrait);
        }

        //Schedules a commit of this transaction. The commit does not happen immediately
        fragmentTransaction.commit();

    }
}
