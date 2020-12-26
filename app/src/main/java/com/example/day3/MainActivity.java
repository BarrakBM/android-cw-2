package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText na = findViewById(R.id.name);
        EditText ph = findViewById(R.id.phone);
        EditText em = findViewById(R.id.Email);
        EditText ad = findViewById(R.id.adress);
        Button b = findViewById(R.id.button);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class); // to move to other activity after press the button
                String n = na.getText().toString();
                String p = ph.getText().toString();
                String e = em.getText().toString();
                String a = ad.getText().toString();

                i.putExtra("info1", n);
                i.putExtra("info2", p);
                i.putExtra("info3", e);
                i.putExtra("info4", a);

                startActivity(i);

            }
        });

    }
}