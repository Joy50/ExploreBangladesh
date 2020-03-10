package com.joy50.explorebangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AllSpots extends AppCompatActivity {
    ListView listView;
    String[] names={"Ruins of the Buddhist Vihara at Paharpur","Lalbag Fort","Mahasthangarh ","Sonargaon","Puthia Temple Complex","Kantajew Temple","Shaat Gombuj Masjid"
            ,"Armenian Church of the Holy Resurrection","Star Mosque","Baitul Mukarram Mosque","Tajhat Palace","Mainimati Ruins","Panam Nagar","Shilaidaha Kuthibari-Rabindranath Tagore's Residence"
            ,"Chittagong Commonwealth War Cemetery"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_spots);
        listView=(ListView)findViewById(R.id.list);

        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,names);
        listView.setAdapter(arrayAdapter);
    }
}
