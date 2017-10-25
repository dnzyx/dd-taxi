package com.leanring.dnzyx.dd_taxi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Lenovo on 2017/10/25.
 */

public class talk  extends Fragment {

    View talk;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        talk=inflater.inflate(R.layout.talk, container,false);
        return talk;
    }
}
