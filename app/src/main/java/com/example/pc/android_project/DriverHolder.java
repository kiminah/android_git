package com.example.pc.android_project;

import android.view.View;
import android.widget.TextView;

public class DriverHolder {
    public TextView wordView;
    public TextView meanView;

    public DriverHolder(View root){
        wordView = (TextView) root.findViewById(R.id.tv_word);
        meanView = (TextView) root.findViewById(R.id.tv_mean);
    }
}
