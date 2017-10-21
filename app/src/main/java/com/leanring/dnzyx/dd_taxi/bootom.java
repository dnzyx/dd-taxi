package com.leanring.dnzyx.dd_taxi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by Lenovo on 2017/10/19.
 */

public class bootom extends Fragment
{
    View bottom;
    ImageButton talk,server,me;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

       bottom = inflater.inflate(R.layout.bottom, null);
        talk= (ImageButton)bottom.findViewById(R.id.talk);
        server=(ImageButton)bottom.findViewById(R.id.server);
        me=(ImageButton)bottom.findViewById(R.id.me);
        return bottom;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

     talk.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

         }
     });

        server.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

      me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
