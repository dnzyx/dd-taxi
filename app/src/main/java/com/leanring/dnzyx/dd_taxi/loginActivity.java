package com.leanring.dnzyx.dd_taxi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/10/18.
 */

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login= (Button)findViewById(R.id.loginBtn);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //login secceseful
                Intent i=new Intent(loginActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
