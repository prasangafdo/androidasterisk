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

        String a = "*\n" + "**\n" + "***";
        String code =" for (int i = 0; i<5;i++){\n" +
                " \n               for (int j = 0; j<i; j++){\n" +
                " \n                System.out.print(\"*\");\n" +
                " \n               }\n" +
                " \n               System.out.println();\n" +
                "     }";

        EditText et_pattern, et_code;

        et_pattern = findViewById(R.id.et_pattern);
        et_code = findViewById(R.id.et_code);

        et_pattern.setText(a.toString());
        et_code.setText(code.toString());
    }
}
