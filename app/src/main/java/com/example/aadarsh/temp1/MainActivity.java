package com.example.aadarsh.temp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] options = {"Flight Status","Entertainment","Post Flight Assistance"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,options);
        listView = findViewById(R.id.mainOptions);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = ((TextView)view).getText().toString();
                if (selectedItem.equals("Flight Status")) {
                    Intent intent = new Intent(MainActivity.this,FlightStatus.class);
                    overridePendingTransition(R.anim.left_right,R.anim.right_left);
                    startActivity(intent);
                }
                if (selectedItem.equals("Entertainment")) {
                    Intent intent = new Intent(MainActivity.this,Entertainment.class);
                    overridePendingTransition(R.anim.left_right,R.anim.right_left);
                    startActivity(intent);
                }
                if (selectedItem.equals("Post Flight Assistance")) {
                    Intent intent = new Intent(MainActivity.this,PostAssist.class);
                    overridePendingTransition(R.anim.left_right,R.anim.right_left);
                    startActivity(intent);
                }
            }
        });
    }
}
