package com.joy50.explorebangladesh;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WithLoginMainMenu extends AppCompatActivity {

    Button nearby,allspots,searchplace,aboutbangladesh;
    ViewPager v;
    CustomSwiper adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_login_main_menu);
        nearby=(Button)findViewById(R.id.button3) ;
        allspots=(Button)findViewById(R.id.button4) ;
        searchplace=(Button)findViewById(R.id.button5) ;
        aboutbangladesh=(Button)findViewById(R.id.button6);
        v=(ViewPager)findViewById(R.id.imageView2);
        adapter=new CustomSwiper(this);
        v.setAdapter(adapter);
        nearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),NearBy.class));
            }
        });
        allspots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),AllSpots.class));
            }
        });
        searchplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),SearchScreen.class));
            }
        });
        aboutbangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Bangladesh.class));
            }
        });
    }
}
