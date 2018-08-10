package com.example.pc.android_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class etiquette_menu_control extends AppCompatActivity {

    ListView etiquette_listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.etiquette_menu);

        final String[] ary = {"1 상식", "2 예의범절"};

        etiquette_listview = (ListView) findViewById(R.id.etiquette_listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ary);
        etiquette_listview.setAdapter(adapter);

        etiquette_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                /** int i 는 클릭한 항목의 순번
                 * long l 는 항목의 아이디  */

                Integer list_num = i;
                Intent intent = new Intent(getApplicationContext(), etiquette_control.class);

                intent.putExtra("list_num", list_num);
                intent.putExtra("list_menu", ary[i]);

                startActivity(intent);

            }
        });

    }
}
