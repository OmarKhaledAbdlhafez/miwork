package com.example.omarkhaled.miwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class number extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ArrayList<word> numberlist = new ArrayList<word>();
        numberlist.add(new word("two ","uno"));
        numberlist.add(new word("three ","dos"));
        numberlist.add(new word("four ","trac"));
        numberlist.add(new word("five ","quatro"));
        numberlist.add(new word("sex ","cinco"));
        numberlist.add(new word("seven ","sex"));
        numberlist.add(new word("eight ","8"));
        numberlist.add(new word("nine ","9"));
        numberlist.add(new word("ten ","10"));

        wordadapater adapater = new wordadapater(this,numberlist);
        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapater);

    }
}
