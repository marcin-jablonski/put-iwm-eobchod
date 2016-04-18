package com.example.jablo.eobchodandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RoomListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        LinearLayout blockList = (LinearLayout) findViewById(R.id.room_list);
        //get room list from api
        //foreach room add TextView
        TextView sample1 = new TextView(this);
        sample1.setPadding(10, 10, 10, 10);
        sample1.setTextSize(30);
        sample1.setText("Room 1");
        sample1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        sample1.setWidth(blockList.getWidth());
        sample1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRoomItemClick(v);
            }
        });

        TextView sample2 = new TextView(this);
        sample2.setPadding(10, 10, 10, 10);
        sample2.setTextSize(30);
        sample2.setText("Room 2");
        sample2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        sample2.setWidth(blockList.getWidth());
        sample2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRoomItemClick(v);
            }
        });

        blockList.addView(sample1);
        blockList.addView(sample2);
    }

    public void onRoomItemClick(View view) {
        //get block data and load to intent
        startPatientsListActivity();
    }

    public void startPatientsListActivity(){
        Intent intent = new Intent(this, PatientsListActivity.class);
        startActivity(intent);
    }
}
