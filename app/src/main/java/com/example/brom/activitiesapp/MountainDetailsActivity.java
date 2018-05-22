package com.example.brom.activitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);

        Intent intent = getIntent();
        String messageName = intent.getStringExtra("MountainName");
        String messageHeight = intent.getStringExtra("MountainHeight");
        String messageLocation = intent.getStringExtra("MountainLocation");
        //Toast.makeText(getApplicationContext(), messageName+" "+messageHeight+" "+messageLocation , Toast.LENGTH_LONG).show();

        TextView textViewName = (TextView)findViewById(R.id.text_MountainName);
        TextView textViewLocation = (TextView)findViewById(R.id.text_MountainLocation);
        TextView textViewHeight = (TextView)findViewById(R.id.text_MountainHeight);
        textViewName.setText("Mountain: " + messageName);
        textViewLocation.setText("Location: " + messageLocation);
        textViewHeight.setText("Height: " + messageHeight);
    }
}