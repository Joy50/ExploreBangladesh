package com.joy50.explorebangladesh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;

public class SearchScreen extends AppCompatActivity {
    Button Search;
    MultiAutoCompleteTextView placename;
    ListView listView;
    String[] names={"Ruins of the Buddhist Vihara at Paharpur","Lalbag Fort","Mahasthangarh ","Sonargaon","Puthia Temple Complex","Kantajew Temple","Shaat Gombuj Masjid"
            ,"Armenian Church of the Holy Resurrection","Star Mosque","Baitul Mukarram Mosque","Tajhat Palace","Mainimati Ruins","Panam Nagar","Shilaidaha Kuthibari-Rabindranath Tagore's Residence"
            ,"Chittagong Commonwealth War Cemetery"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_screen);
        Search=(Button)findViewById(R.id.button7);
        placename=(MultiAutoCompleteTextView) findViewById(R.id.editText5);
        listView=(ListView)findViewById(R.id.listView);

        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,names);
        listView.setAdapter(arrayAdapter);

        placename.setAdapter(arrayAdapter);
        placename.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("geo:0,0?q="+placename.getText().toString());
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
}
