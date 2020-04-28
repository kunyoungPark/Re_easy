package com.example.re_easy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    public void onCreate(Bundle bd){
        super.onCreate(bd);
//        setContentView(R.layout.result);
//        TextView tv = findViewById(R.id.tv_res);
//        Intent it = getIntent();
//        String res = it.getStringExtra("result");
//        tv.setText(res);
        setContentView(R.layout.result);

        ImageButton back = findViewById(R.id.imageButton_f);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
