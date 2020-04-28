package com.example.re_easy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Inst extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diy_detail);
        ImageButton ib = findViewById(R.id.imageView_detail);
        ImageButton back = findViewById(R.id.imageButton_f);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
//
//        wb.setWebViewClient(new WebViewClient());
//        WebSettings webSettings = wb.getSettings();
//        webSettings.setJavaScriptEnabled(true);



        Intent myit = getIntent();
        int idx = Integer.parseInt(myit.getStringExtra("index"));

        switch (idx) {
            case 1:
                ib.setImageResource(R.drawable.metaldiyinst);
//                wb.loadUrl("file:///android_asset/www/metal.html");
                ib.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Context c = v.getContext();
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://homesthetics.net/17-diy-tin-can-crafts-and-ideas/"));
                        c.startActivity(intent);
                    }
                });
                break;
            case 2:
                ib.setImageResource(R.drawable.paperdiyinst);
//                wb.loadUrl("file:///android_asset/www/paper.html");
                ib.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Context c = v.getContext();
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.designrulz.com/product-design/2012/10/diy-ideas-best-recycled-magazines-projects/"));
                        c.startActivity(intent);
                    }
                });
                break;
           case 3:
               ib.setImageResource(R.drawable.glassdiyinst);
//               wb.loadUrl("file:///android_asset/www/glass.html");
               ib.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Context c = v.getContext();
                       Intent intent = new Intent(Intent.ACTION_VIEW);
                       intent.setData(Uri.parse("https://www.youtube.com/watch?v=79YC-zH5Mxo"));
                       c.startActivity(intent);
                   }
               });
                break;
            case 4:
                ib.setImageResource(R.drawable.plasticdiyinst);
//                wb.loadUrl("file:///android_asset/www/plastic.html");
                ib.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Context c = v.getContext();
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.goodshomedesign.com/diy-plastic-spoon-lamp/"));
                        c.startActivity(intent);
                    }
                });
               break;

            default:
                break;
        }

    }
}
