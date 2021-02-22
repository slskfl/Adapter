package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyListAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    List<ItemData> itemData;
    public MyListAdapter(Context context, List<ItemData> itemData) {
        this.context=context;
        this.itemData=itemData;
        this.inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return itemData.size();
    }

    @Override
    public Object getItem(int position) {
        return itemData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null){
            listItemView=inflater.inflate(R.layout.listview_item, null);
        }
        ImageView itemImage=listItemView.findViewById(R.id.itemImage);
        TextView itemTitle=listItemView.findViewById(R.id.itemTitle);
        TextView itemContent=listItemView.findViewById(R.id.itemContent);
        ItemData iData=itemData.get(position);
        itemImage.setImageResource(iData.getImgID());
        itemTitle.setText(iData.getTitle());
        itemContent.setText(iData.getContent());
        return listItemView;
    }
}
