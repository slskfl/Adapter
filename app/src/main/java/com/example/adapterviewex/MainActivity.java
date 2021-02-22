package com.example.adapterviewex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Gallery gallery1;
    MyGalleryAdapter adapter;
    ImageView imgPoster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gallery1=findViewById(R.id.gallery);
        adapter=new MyGalleryAdapter(this);
        gallery1.setAdapter(adapter);
        imgPoster=findViewById(R.id.imgPoster);
    }
    //어댑터 클래스
    public class MyGalleryAdapter extends BaseAdapter{
        Context context;
        int posterIDs[]={R.drawable.mov01, R.drawable.mov02, R.drawable.mov03,
                R.drawable.mov04, R.drawable.mov05,
                R.drawable.mov06, R.drawable.mov07,R.drawable.mov08,
                R.drawable.mov09, R.drawable.mov10};
        public MyGalleryAdapter(Context context) {
            this.context=context;
        }

        @Override
        public int getCount() {
            return posterIDs.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView ivPoster=new ImageView(context);
            ivPoster.setLayoutParams(new Gallery.LayoutParams(200,300));
            ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ivPoster.setPadding(5,5,5,5);
            ivPoster.setImageResource(posterIDs[position]);
            ivPoster.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    imgPoster.setImageResource(posterIDs[position]);
                    return false;
                }
            });
            return ivPoster;
        }
    }
}