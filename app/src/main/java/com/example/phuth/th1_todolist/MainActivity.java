package com.example.phuth.th1_todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.phuth.th1_todolist.adapter.CustomBaseAdapter;
import com.example.phuth.th1_todolist.adapter.ImageAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText txtTask, txtHour, txtDay;
    Spinner spinner;
    ListView lvTasks;
    Button btnAdd;
    public static ArrayList<Integer> listAnh;
    ArrayList<Task> tasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listAnh = new ArrayList<>();
        listAnh.add(R.drawable.img1);
        listAnh.add(R.drawable.img2);


        txtTask = findViewById(R.id.txtTask);
        txtHour = findViewById(R.id.txtHour);
        txtDay = findViewById(R.id.txtDay);
        btnAdd = findViewById(R.id.btnAdd);
        spinner = findViewById(R.id.spinner);
        lvTasks = findViewById(R.id.lvTasks);

        tasks = new ArrayList<>();
        loadSpinner();


        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(this, R.layout.custom_layout, tasks);
        customBaseAdapter.notifyDataSetChanged();
        lvTasks.setAdapter(customBaseAdapter);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Task task = new Task(txtTask.getText().toString(), txtHour.getText().toString(), txtDay.getText().toString(), listAnh.get(spinner.getSelectedItemPosition()));
                tasks.add(task);
                CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(MainActivity.this, R.layout.custom_layout, tasks);
                customBaseAdapter.notifyDataSetChanged();
                lvTasks.setAdapter(customBaseAdapter);
            }
        });
    }

    private void loadSpinner() {
        ImageAdapter adapter = new ImageAdapter(this, R.layout.icon, listAnh);
        adapter.notifyDataSetChanged();
        spinner.setAdapter(adapter);
    }
}
