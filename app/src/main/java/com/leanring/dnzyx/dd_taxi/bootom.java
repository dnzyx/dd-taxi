package com.leanring.dnzyx.dd_taxi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
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
    AppCompatActivity activity;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

       bottom = inflater.inflate(R.layout.bottom,container,false);
        talk= (ImageButton)bottom.findViewById(R.id.talk);
        server=(ImageButton)bottom.findViewById(R.id.server);
        me=(ImageButton)bottom.findViewById(R.id.me);
        activity= (AppCompatActivity) getActivity();
        return bottom;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

     talk.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             FragmentManager fragmentManager=activity.getSupportFragmentManager();

             FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
             fragmentTransaction.replace(R.id.mainActivity_content,new talk(),"");
             fragmentTransaction.addToBackStack(null);//返回栈
             fragmentTransaction.commit();


         }
     });

        server.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=activity.getSupportFragmentManager();

                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.mainActivity_content,new location(),"");
                fragmentTransaction.addToBackStack(null);//返回栈
                fragmentTransaction.commit();
            }
        });

      me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
