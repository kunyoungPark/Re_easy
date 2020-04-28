package com.example.re_easy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScanRes extends AppCompatActivity {

    String resStr;

    public void onCreate(Bundle bd){
        super.onCreate(bd);
        setContentView(R.layout.scan_res);

        TextView tv = findViewById(R.id.textView_scan_res);
        Intent it = getIntent();
        String res = it.getStringExtra("result");
        tv.setText("Is '"+res+"' right?");
        resStr = res;
        Button yes = findViewById(R.id.button_yes);
        Button no = findViewById(R.id.button_no);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resStr == "8801056086558") {
                    Intent myit = new Intent(ScanRes.this, Result.class);
                    myit.putExtra("result",resStr);
                    startActivity(myit);
                    finish();
                }
                else if (resStr == "8801045592862") {
                    Intent myit = new Intent(ScanRes.this, Result2.class);
                    myit.putExtra("result",resStr);
                    startActivity(myit);
                    finish();
            }
                else if (resStr == "00944601") {
                    Intent myit = new Intent(ScanRes.this, Result3.class);
                    myit.putExtra("result",resStr);
                    startActivity(myit);
                    finish();
                }
                else if (resStr == "0005150004816") {
                    Intent myit = new Intent(ScanRes.this, Result4.class);
                    myit.putExtra("result",resStr);
                    startActivity(myit);
                    finish();
                }
                else {
                    Intent myit = new Intent(ScanRes.this, Result.class);
                    myit.putExtra("result",resStr);
                    startActivity(myit);
                    finish();
                }

            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myit = new Intent(ScanRes.this, BarcodeActivity.class);
                startActivity(myit);
                finish();
            }
        });
    }

}
