package com.example.spinnerex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1;
    ArrayAdapter<String> adapter;
    int posterIDs[]={R.drawable.mov01, R.drawable.mov02, R.drawable.mov03,
            R.drawable.mov04, R.drawable.mov05,
            R.drawable.mov06, R.drawable.mov07,R.drawable.mov08,
            R.drawable.mov09, R.drawable.mov10};
    String movie[]={"써니", "완득이", "괴물", "라디오스타", "비열한거리",
    "왕의 남자", "아일랜드", "웰컴투동막골", "헬보이", "백투더퓨처"};
    ImageView ivPoster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1=findViewById(R.id.spinner1);
        ivPoster=findViewById(R.id.ivPoster);
        adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, movie);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // 선택했을 경우
                ivPoster.setImageResource(posterIDs[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //선택하지 않았을 경우
            }
        });
    }
}