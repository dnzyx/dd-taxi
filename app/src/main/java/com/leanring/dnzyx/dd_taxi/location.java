package com.leanring.dnzyx.dd_taxi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Lenovo on 2017/10/19.
 */

public class location extends Fragment {

    View locat;
    Button call_car;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        locat=inflater.inflate(R.layout.location,null);
        call_car=(Button) locat.findViewById(R.id.call_car);
        return inflater.inflate(R.layout.location,container,true);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        call_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
