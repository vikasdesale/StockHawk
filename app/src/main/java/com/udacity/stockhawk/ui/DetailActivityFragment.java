package com.udacity.stockhawk.ui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.udacity.stockhawk.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    String history="";
    String symbol="";
    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            history=arguments.getString("history");
            symbol=arguments.getString("symbol");
        }


        Log.d("Hello Vikas:=","Details = Symbol:"+symbol+" "+": "+history);
        Toast.makeText(getActivity(),""+symbol+"-"+history,Toast.LENGTH_SHORT);
        return view;
    }
}