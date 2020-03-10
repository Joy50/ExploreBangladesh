package com.joy50.explorebangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Rangpur extends AppCompatActivity {
    ListView listView;
    String[] rp={"Nayabad Mosque","Nil dariya(নীল দরিয়া)","Dinajpur Palace","Tajhat Jamidar bari","Manthana jamidar bari","Sitakotha Bihar","Jamlpur jamidarbari mosque","Kantajir mosque","House of Begum Rokeya"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur);
        listView=(ListView)findViewById(R.id.listR);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,rp);
        listView.setAdapter(arrayAdapter);
    }
}
