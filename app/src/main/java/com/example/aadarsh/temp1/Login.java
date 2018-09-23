package com.example.aadarsh.temp1;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    private TextInputEditText flightNumber,PNRCode;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        flightNumber = findViewById(R.id.flightNo);
        PNRCode = findViewById(R.id.PNRCode);
        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flightNumber.getText().toString().equals("abc123") &&
                        PNRCode.getText().toString().equals("abc123")) {
                    Intent intent = new Intent(Login.this,MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Login.this, "Invalid Details..", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
