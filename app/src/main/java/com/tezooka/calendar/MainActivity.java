package com.tezooka.calendar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> days = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            days.add(String.valueOf(i));
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.item_days, days);

        GridView calendarView = (GridView) findViewById(R.id.calendarView);
        calendarView.setAdapter(adapter);
    }

}
