package com.example.re_easy.ui.home;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.re_easy.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.w3c.dom.Text;

import java.io.IOException;

public class HomeFragment extends Fragment {

//    private String url = "https://www.theworldcounts.com/challenges/planet-earth/waste/waste-from-households";
//    private String htmlString = "";
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        ImageButton btn_glass = rootView.findViewById(R.id.imageButton_glass);
        ImageButton btn_paper = rootView.findViewById(R.id.imageButton_paper);
        ImageButton btn_plastic = rootView.findViewById(R.id.imageButton_plastic);
        ImageButton btn_metal = rootView.findViewById(R.id.imageButton_metal);

        WebView myWebView = rootView.findViewById(R.id.webview);
        myWebView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        myWebView.loadUrl("file:///android_asset/www/count.html");
        btn_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),com.example.re_easy.Paper.class);
                startActivity(it);
            }
        });

        btn_glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),com.example.re_easy.Glass.class);
                startActivity(it);
            }
        });

        btn_metal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),com.example.re_easy.Metal.class);
                startActivity(it);
            }
        });

        btn_plastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(),com.example.re_easy.Plastic.class);
                startActivity(it);
            }
        });




        return rootView;
    }
 }