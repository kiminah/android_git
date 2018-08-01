package com.example.pc.android_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class script_control extends AppCompatActivity {

    TextView question, answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.script_view);

        question = (TextView) findViewById(R.id.question);
        answer = (TextView) findViewById(R.id.answer);

        Intent intent = getIntent();
        Integer ary = intent.getIntExtra("list_menu", 0);




    }
}
