package com.example.layoutinflatter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
   LinearLayout mainlayout,mylayout;
   Button buttonadd,buttonremove;
   LayoutInflater layoutInflater;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mylayout=findViewById(R.id.mylayout);
        mainlayout=findViewById(R.id.mainlayout);
        buttonadd=findViewById(R.id.buttonadd);
        buttonremove=findViewById(R.id.buttonremove);
        layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);





        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             layoutInflater.inflate(R.layout.new_layout,mylayout);


            }
        });

        buttonremove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainlayout.removeAllViews();
            }
        });

    }
}