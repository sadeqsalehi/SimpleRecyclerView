package com.example.simplerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView contactList = findViewById(R.id.contactList);
        contactList.setLayoutManager(new LinearLayoutManager(this));
        String[] contactNames = {"Sadeq Salehi", "Samir Abbas Fard", "Ali Dris", "Hani Faisali", "Ali Sawaedi", "Afshin Shokrollahi",
                "Muhammad Alizadeh", "Salim Thameri", "Kadim Rubaihawi"};
        contactList.setAdapter(new ContactAdapter(contactNames));


    }
}
