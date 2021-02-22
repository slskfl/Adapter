package com.example.customlistview;
//        1. (main) 액티비티, xml
//        2. 어댑터 클래스
//        3. 항목 전용 xml
//        4. 항목 데이터 전용 클래스
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MyListAdapter adapter;
    int imgID[]={R.drawable.mov01, R.drawable.mov02, R.drawable.mov03,
            R.drawable.mov04, R.drawable.mov05,
            R.drawable.mov06, R.drawable.mov07,R.drawable.mov08,
            R.drawable.mov09, R.drawable.mov10};
    String title[]={"써니", "완득이", "괴물", "라이오스타", "비열한 거리", "왕의 남자",
            "아일랜드", "웰컴 투 동막골", "헬보이", "백 투 더 퓨처"};
    String content[] ={"7공주 프로젝트", "내 인생이 꼬이기 시작했다.", "가족의 사투가 시작되었다.",
            "언제나 나를 최고라고...", "지금 여기 그 남자의...", "질투의 열마아이 부른",
            "이제 거대한 미래가 창조되었다", "1950년 지금은 전쟁 중...",
            "잘생긴 얼굴만 세상을 구하는 건 아니지!", "과거로 여행을..."};
    List<ItemData> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView1);
        data=new ArrayList<>();
        for(int i=0; i<imgID.length; i++){
            data.add(new ItemData(imgID[i], title[i], content[i]));
        }
        adapter=new MyListAdapter(this, data);
        listView.setAdapter(adapter);
    }
}