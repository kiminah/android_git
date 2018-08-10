package com.example.pc.android_project;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class etiquette_control extends AppCompatActivity {

    TextView title, info_view;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.etiquette_view);

        title = (TextView) findViewById(R.id.title_view);
        info_view = (TextView) findViewById(R.id.info_view);

        btnNext = (Button) findViewById(R.id.btnNext);

        Bundle bundle = getIntent().getExtras();
        Integer num = bundle.getInt("list_num");
        String str = bundle.getString("list_menu");

        /** 리스트 <1. 상식>를 선택했을 경우 */
        if (num == 0) {
            title.setText(str);
            info_view.setText("우측통행");

            /** 리스트 <2. 예의범절>을 선택했을 경우 */
        } else{
            title.setText(str);
            info_view.setText("노인을 공경한다." + "\r\n" + "어른이 먼저 수저를 드신 후 식사를 시작한다." + "\r\n" + "입 안의 음식은 보이면 안된다." + "\r\n" + "먹는 소리를 내면 안된다" + "\r\n" + "어른들보다 일찍 일어나지 않는다." + "\r\n" + "음식을 속으로 집어 먹지 않는다.");
        }



    }
}