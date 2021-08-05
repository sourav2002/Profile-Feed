package com.example.profile3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView back, insta, fb, twitter;
    CardView call,mail,web,address;

    String facebook = "https://fb.com";
    String instagram = "";
    String tw ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        back = findViewById(R.id.back);
        insta = findViewById(R.id.insta);
        fb = findViewById(R.id.fb);
        twitter = findViewById(R.id.twitter);
        call = findViewById(R.id.call);
        mail = findViewById(R.id.mail);
        web = findViewById(R.id.web);
        address = findViewById(R.id.address);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "back button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (facebook.length() != 0){
                    Toast.makeText(getApplicationContext(), "opening facebook", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Facebook details is not available", Toast.LENGTH_SHORT).show();
                }
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (instagram.length() != 0){
                    Toast.makeText(getApplicationContext(), "opening Instagram", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), "instagram details is not available", Toast.LENGTH_SHORT).show();
                }            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tw.length() != 0){
                    Toast.makeText(getApplicationContext(), "opening Twitter", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Twitter details is not available", Toast.LENGTH_SHORT).show();
                }            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "back button clicked", Toast.LENGTH_SHORT).show();
            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening Email", Toast.LENGTH_SHORT).show();
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Opening Browser", Toast.LENGTH_SHORT).show();
            }
        });
        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Showing location in google map", Toast.LENGTH_SHORT).show();
            }
        });

    }
}