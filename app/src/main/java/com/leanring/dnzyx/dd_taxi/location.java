package com.leanring.dnzyx.dd_taxi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Lenovo on 2017/10/19.
 */

public class location extends Fragment {

    View locat;
    Button call_car;
    EditText location,des;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        locat=inflater.inflate(R.layout.location,container,false);
        call_car=(Button) locat.findViewById(R.id.call_car);
        location =(EditText)locat.findViewById(R.id.locat);
        des=(EditText)locat.findViewById(R.id.des);
        location.setCursorVisible(false);
        des.setCursorVisible(false);
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
