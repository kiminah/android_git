package com.example.pc.android_project;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class script_control extends AppCompatActivity {

    TextView question, answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.script_view);

        question = (TextView) findViewById(R.id.question);
        answer = (TextView) findViewById(R.id.answer);

        Bundle bundle = getIntent().getExtras();
        Integer num = bundle.getInt("list_menu");

        // question.setText(ary);
        DBHelper helper = new DBHelper(this);

        SQLiteDatabase db = helper.getWritableDatabase();


        /** DBHelper.java 에서 불러온 DB의 SQL문 작성 */
        Cursor cursor = db.rawQuery("SELECT * FROM scriptTB", null);

        String qu = "";
        String an = "";

        if (num == 1) {
            while (cursor.moveToNext()) {
                qu += cursor.getString(0);
                an += cursor.getString(1);
            }
            question.setText(qu);
            answer.setText(an);

            db.close();
            helper.close();
        }


    }
}
