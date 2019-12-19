package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {
    private String[] data={"第一个","第二个","第三个"};
    private ListView listView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定listview
        listView1 =findViewById(R.id.listview_1);
        //定义Adoper
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(
                this,//上下文
                android.R.layout.simple_list_item_1,//显示的item
                data//需要输出的数据
        );
        listView1.setAdapter(arrayAdapter);
    }
}