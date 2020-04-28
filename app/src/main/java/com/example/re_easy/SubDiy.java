package com.example.re_easy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SubDiy extends AppCompatActivity {
    int theIdx;
    public void onCreate(Bundle bd){
        super.onCreate(bd);
        setContentView(R.layout.diy_button_page);
        ImageButton back = findViewById(R.id.imageButton_f);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ImageButton pic= findViewById(R.id.imageButton_g);

        Intent myit = getIntent();
        int idx = Integer.parseInt(myit.getStringExtra("diy_num"));
        theIdx = idx;

        switch (idx){
            case 1:
                pic.setImageResource(R.drawable.metaldiy);
                break;
            case 2:
                pic.setImageResource(R.drawable.paperdiy);
                break;
            case 3:
                pic.setImageResource(R.drawable.glassdiy);
                break;
            case 4:
                pic.setImageResource(R.drawable.plasticdiy);
                break;

            default:
                break;
        }

        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnIt = new Intent(SubDiy.this,  Inst.class);
                btnIt.putExtra("index", Integer.toString(theIdx));
                startActivity(btnIt);
            }
        });



    }
}