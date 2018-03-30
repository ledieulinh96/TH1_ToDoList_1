package com.example.phuth.th1_todolist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.phuth.th1_todolist.MainActivity;
import com.example.phuth.th1_todolist.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by phuth on 3/30/2018.
 */

public class ImageAdapter extends BaseAdapter{

    Context context;
    int layout;
    ArrayList<Integer> list;

     public ImageAdapter(Context context, int layout, ArrayList<Integer> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, viewGroup, false );
        ImageView icon = view.findViewById(R.id.img);
        icon.setImageResource(list.get(i));

        return view;
    }
}
