package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button gb = findViewById(R.id.goback);

        Bundle b = getIntent().getExtras();

        String n = b.getString("info1");
        String p = b.getString("info2");
        String e = b.getString("info3");
        String a = b.getString("info4");



        TextView t = findViewById(R.id.n1);
        TextView ph = findViewById(R.id.p1);
        TextView ema = findViewById(R.id.e1);
        TextView adr = findViewById(R.id.a1);


        t.setText(n);
        ph.setText(p);
        ema.setText(e);
        adr.setText(a);





        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+p));
                startActivity(callIntent);
            }
        });

        ema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent email = new Intent((Intent.ACTION_SEND));
               email.setData(Uri.parse(e));
               startActivity(email);

            }
        });





        gb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(MainActivity2.this, MainActivity.class); // the go back button to go back to the main activity


                startActivity(h);
            }
       });





    }
}