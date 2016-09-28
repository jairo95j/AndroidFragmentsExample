package com.example.jimenez.jairo.androidfragmentsexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jairo on 9/27/2016.
 */

public class FragmentLandscape extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //inflate method has three arguments
        //1. Resource id of the layout you want to inflate
        //2. ViewGroup to be the parent of the inflated layout
        //3. Boolean indicating whether the inflated layout should be attached to the ViewGroup
        return inflater.inflate(R.layout.landscape_fragment, container, false);
    }
}
