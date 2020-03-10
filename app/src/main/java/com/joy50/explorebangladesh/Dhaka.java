package com.joy50.explorebangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Dhaka extends AppCompatActivity {

    ListView listView;
    String[] dp={"Baliati Jamidar bari","Sadhinota Stomvo (স্বাধীনতা স্তম্ভ)","Jallad Bhumi","Jallad Khana Killing Field","Iddrakpur kellah","Boro Katra","Sudha sodon","Mohera jamidarbari","Hoseni dalan","Lalbag kellah","Dhanbari Nawab bari","Armechian Charch","Haji gang Durga","Nijhum Toures","Murapara jaminder bari","Pori bibi mazar","Mir jumla dhaka gate","Shahid minar","national Musiam"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka);
        listView=(ListView)findViewById(R.id.listD);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,dp);
        listView.setAdapter(arrayAdapter);
    }
}
