package com.prasanga.fdo.asteriskpatterns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Please select the pattern Prasanga");

        Button btn_pattern1, btn_pattern2, btn_pattern3;

        btn_pattern1 = (Button) findViewById(R.id.btn_pattern1);
        btn_pattern2 = (Button) findViewById(R.id.btn_pattern2);
        btn_pattern3 = (Button) findViewById(R.id.btn_pattern3);

        btn_pattern1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Pattern1Activity.class);
                startActivity(intent);
            }
        });

        btn_pattern2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Pattern2Activity.class);
                startActivity(intent);
            }
        });

        btn_pattern3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Pattern3Activity.class);
                startActivity(intent);
            }
        });
    }


}
