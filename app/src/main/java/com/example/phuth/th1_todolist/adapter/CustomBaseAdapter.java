package com.example.phuth.th1_todolist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.phuth.th1_todolist.R;
import com.example.phuth.th1_todolist.Task;

import java.util.ArrayList;

/**
 * Created by phuth on 3/30/2018.
 */

public class CustomBaseAdapter extends BaseAdapter{

    Context context;
    int layout;
    ArrayList<Task> list;

     public CustomBaseAdapter(Context context, int layout, ArrayList<Task> list) {
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

        TextView lbTask = view.findViewById(R.id.lbTask);
        TextView lbHour = view.findViewById(R.id.lbHour);
        TextView lbDay = view.findViewById(R.id.lbDay);


        lbTask.setText(list.get(i).getName());
        lbHour.setText(list.get(i).getHour());
        lbDay.setText(list.get(i).getDay());

        ImageView icon = view.findViewById(R.id.img);
        icon.setImageResource(list.get(i).getImg());


        return view;
    }
}
