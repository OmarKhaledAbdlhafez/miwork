package com.example.omarkhaled.miwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         TextView family = (TextView)findViewById(R.id.family);
        family.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent familyintent = new Intent(MainActivity.this , family.class);
                startActivity(familyintent);
            }

        });

        TextView number = (TextView)findViewById(R.id.numbers);
        number.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent numberintent = new Intent(MainActivity.this , number.class);
                startActivity(numberintent);
            }

        });

        TextView list = (TextView)findViewById(R.id.list);
        list.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , list.class);
                startActivity(intent);
            }

        });

        TextView counter = (TextView)findViewById(R.id.counter);
        counter.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent countintent = new Intent(MainActivity.this , counter.class);
                startActivity(countintent);
            }

        });
    }
}
