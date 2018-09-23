package com.example.aadarsh.temp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PostAssist extends AppCompatActivity {

    private String[] postAssistOptions = {"Baggage Status","Need a ride?","Hotel Check-Ins"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_assist);
        listView = findViewById(R.id.postAssistOptions);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,postAssistOptions);
        listView.setAdapter(adapter);
    }
}
