package com.example.re_easy.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.re_easy.Plastic;
import com.example.re_easy.R;
import com.example.re_easy.SubPlastic;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
//        final TextView textView = root.findViewById(R.id.text_notifications);
//        notificationsViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        ImageButton imb1 = root.findViewById(R.id.imageButton_metal);
        ImageButton imb2 = root.findViewById(R.id.imageButton_paper);
        ImageButton imb3 = root.findViewById(R.id.imageButton_glass);
        ImageButton imb4 = root.findViewById(R.id.imageButton_plastic);


        imb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(), com.example.re_easy.SubDiy.class);
                it.putExtra("diy_num","1");
                startActivity(it);

            }
        });
        imb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(), com.example.re_easy.SubDiy.class);
                it.putExtra("diy_num","2");
                startActivity(it);

            }
        });
        imb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(), com.example.re_easy.SubDiy.class);
                it.putExtra("diy_num","3");
                startActivity(it);

            }
        });
        imb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getActivity(), com.example.re_easy.SubDiy.class);
                it.putExtra("diy_num","4");
                startActivity(it);

            }
        });

        return root;
    }
}