package com.prasanga.fdo.asteriskpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Pattern1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern1);
        getSupportActionBar().setTitle("Pattern #1");

        String a = " *\n" + "**\n" + "***";

        EditText et_pattern, et_code;

        et_pattern = findViewById(R.id.et_pattern);
        et_code = findViewById(R.id.et_code);

        et_pattern.setText(a.toString());
    }
}
