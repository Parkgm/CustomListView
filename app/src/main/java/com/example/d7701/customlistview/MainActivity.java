package com.example.d7701.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] data = {"사과", "포도", "바나나", "망고", "수박", "배", "딸기", "감", "키위", "귤", "브로콜리", "양배추", "토마토", "복숭아", "참외","오렌지","한라봉","체리"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview = findViewById(R.id.listView1);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this ,android.R.layout.simple_list_item_1,data );
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String temp = (String)adapterView.getItemAtPosition(i);
                Toast.makeText(MainActivity.this,temp,Toast.LENGTH_SHORT).show();

            }
        });
    }





}
