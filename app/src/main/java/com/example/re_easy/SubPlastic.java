package com.example.re_easy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SubPlastic extends AppCompatActivity {

    public void onCreate(Bundle bd){
        super.onCreate(bd);
        setContentView(R.layout.sub_plastic);

        ImageView cont = findViewById(R.id.imageView_sub_content);

        Intent myit = getIntent();
        int idx = Integer.parseInt(myit.getStringExtra("plas_num"));

        switch (idx){
            case 1:
                cont.setImageResource(R.drawable.pl1);
                break;
            case 2:
                cont.setImageResource(R.drawable.pl2);
                break;
            case 3:
                cont.setImageResource(R.drawable.pl3);
                break;
            case 4:
                cont.setImageResource(R.drawable.pl4);
                break;
            case 5:
                cont.setImageResource(R.drawable.pl5);
                break;
            case 6:
                cont.setImageResource(R.drawable.pl6);
                break;
            case 7:
                cont.setImageResource(R.drawable.pl7);
                break;
            default:
                break;
        }



    }
}
