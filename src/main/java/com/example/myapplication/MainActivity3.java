package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {
    private ListView listView;
    //字符串组合
    private String [] data = {"第一个","第二个","第三个"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_main);
        //找到listview 组件
        listView = (ListView) findViewById(R.id.listview_2);

        List<StudentData> mStudentDataList = new ArrayList<>();  //创建studentData 对象集合
        for( int i = 1; i <= 18 ; i++) {
            StudentData mStudentData = new StudentData();      //循环创建studentData 对象
            mStudentData.setName("num " + i + " 号");          //为对象设置姓名
            mStudentData.setAge(i);                             //为对象设置 年龄
            mStudentData.setPhoto(R.drawable.ic_launcher_background);              //为对象设置照片
            mStudentDataList.add(mStudentData);                  //将对象添加到列表中
        }

        //创建Adapter 实例化对象， 调用构造函数传参，将数据和adapter  绑定

        MyListAdapter mMyListAdapter = new MyListAdapter(mStudentDataList,this);

        listView.setAdapter(mMyListAdapter);   //将定义的adapter 和 listView 绑定

    }
}
