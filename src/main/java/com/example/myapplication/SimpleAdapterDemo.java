package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class SimpleAdapterDemo extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);
        //找到listview组件
        listView = findViewById(R.id.listview_1);
        //创建一个含有hanshmap的列表集合
        List<HashMap<String,String>> data = new ArrayList<>();
        for(int i = 1; i<= 18; i++){//创建18个map数据对象，每个map数据对象有两个键值数据
            //创建Hashmap对象，添加键值数据
            HashMap<String,String>map=new HashMap<>();
            //像map对象添加两组键值对数据
            map.put("key_one","dataOne_"+i);
            map.put("key_two","dataTow-"+i);
            //将map对象添加到data集合
            data.add(map);
        }
        SimpleAdapter simpleAdapter=new SimpleAdapter(
                this,
                data,
                R.layout.listview_item,
                new String[]{"key_one","key_two"},
                new int[]{R.id.test_one,R.id.text_two});
        listView.setAdapter(simpleAdapter);
    }
}


