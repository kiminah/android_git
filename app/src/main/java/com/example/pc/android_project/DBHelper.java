package com.example.pc.android_project;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String TAG = "DATABASES";

    public DBHelper(Context context) {
        super(context, "word_data", null, DATABASE_VERSION);

    }

    @Override

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists wordTB(word text, mean text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists wordTB");
        onCreate(db);
    }
}
