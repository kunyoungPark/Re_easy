package com.example.re_easy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Plastic extends AppCompatActivity {


    public void onCreate(Bundle bd){
        super.onCreate(bd);
        setContentView(R.layout.plastic_home);

        ImageButton imb1 = findViewById(R.id.imageButton);
        ImageButton imb2 = findViewById(R.id.imageButton2);
        ImageButton imb3 = findViewById(R.id.imageButton3);
        ImageButton imb4 = findViewById(R.id.imageButton4);
        ImageButton imb5 = findViewById(R.id.imageButton5);
        ImageButton imb6 = findViewById(R.id.imageButton6);
        ImageButton imb7 = findViewById(R.id.imageButton7);
        ImageButton imb8 = findViewById(R.id.imageButton8);
        ImageButton back = findViewById(R.id.imageButton_f);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        imb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Plastic.this, SubPlastic.class);
                it.putExtra("plas_num","1");
                startActivity(it);

            }
        });
        imb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Plastic.this, SubPlastic.class);
                it.putExtra("plas_num","2");
                startActivity(it);

            }
        });
        imb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Plastic.this, SubPlastic.class);
                it.putExtra("plas_num","3");
                startActivity(it);

            }
        });
        imb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Plastic.this, SubPlastic.class);
                it.putExtra("plas_num","4");
                startActivity(it);

            }
        });
        imb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Plastic.this, SubPlastic.class);
                it.putExtra("plas_num","5");
                startActivity(it);

            }
        });
        imb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Plastic.this, SubPlastic.class);
                it.putExtra("plas_num","6");
                startActivity(it);

            }
        });
        imb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Plastic.this, SubPlastic.class);
                it.putExtra("plas_num","7");
                startActivity(it);
            }
        });


        imb8.setVisibility(View.INVISIBLE);

    }
}
