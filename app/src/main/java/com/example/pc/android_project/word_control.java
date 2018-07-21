package com.example.pc.android_project;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class word_control extends AppCompatActivity {
    ListView listView;
    item_data item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_view);

        listView = (ListView) findViewById(R.id.listview);

        DBHelper helper = new DBHelper(this);

        SQLiteDatabase db = helper.getWritableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM wordTB", null);

        ArrayList<DriveVO> datas = new ArrayList<>();

        while (cursor.moveToNext()) {
            DriveVO vo = new DriveVO();
            vo.word = cursor.getString(0);
            vo.mean = cursor.getString(1);
            datas.add(vo);
        }

        db.close();
        helper.close();

        DriveAdapter adapter = new DriveAdapter(this, R.layout.item, datas);

        listView.setAdapter(adapter);
    }

}





