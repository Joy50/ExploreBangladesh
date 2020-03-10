package com.joy50.explorebangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class NearBy extends AppCompatActivity {

    RadioButton dhaka,rangpur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_near_by);
        rangpur=(RadioButton)findViewById(R.id.radioButton6);
        dhaka=(RadioButton)findViewById(R.id.radioButton);
        dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Dhaka.class));
            }
        });
        rangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Rangpur.class));
            }
        });
    }
}
