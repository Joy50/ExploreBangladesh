package com.joy50.explorebangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Rajshahi extends AppCompatActivity {
    ListView listView;
    String [] rajp={"dibo dighi","bagha mosque","Chika mosque","loton mosque","Salami Darwaja","gokul medh","Boro khuthi","Masjid e khoold","Vimer patni","Sompur bihar","Tanti para masjid","digha potia mosque","pothiya rajbari"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi);
        listView=(ListView)findViewById(R.id.listRaj);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,rajp);
        listView.setAdapter(arrayAdapter);
    }
}
