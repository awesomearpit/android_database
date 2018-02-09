package com.apkglobal.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
ListView listView;
Spinner spinner;
String[] name={"select the name","pawan","raman","chaman","naman","daman"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      spinner=findViewById(R.id.spinner);

        //   listView=findViewById(R.id.listview);
        //to add the data in array list
        //to add the single data via hashmap
         ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();

          for(int i=0;i<name.length;i++) {
              HashMap<String, String> hashMap = new HashMap<>();
              hashMap.put("name", name[i]);
              arrayList.add(hashMap);
          }
              String[]from={"name"};
              int[] to={android.R.id.text1};
              SimpleAdapter simpleAdapter=new SimpleAdapter(this,arrayList,android.R.layout.simple_list_item_1,from,to);
              spinner.setAdapter(simpleAdapter);

              //to attach the adapter into listview
   //           listView.setAdapter(simpleAdapter);

              //to click on the lsit view
/*
              listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                  @Override
                  public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                      Toast.makeText(MainActivity.this, name[i].toString(), Toast.LENGTH_SHORT).show();


                  }
              });
*/




    }
}

