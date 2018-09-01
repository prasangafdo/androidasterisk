package com.prasanga.fdo.asteriskpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Pattern2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern2);
        getSupportActionBar().setTitle("Pattern #2(Odd pattern)");

        String pattern = "" +
                "             *\n" +
                "            ***\n" +
                "           *****\n";
        String code = "for(int i=1;i<=5;i++) {\n" +
                "            for (int j = 1; j <= 5 - i; j++)\n" +
                "\n" +
                "            {\n" +
                "                System.out.print(\".\");//Printing \".\" in reverse order\n" +
                "            }\n" +
                "\n" +
                "            for (int k = 1; k <= i * 2 - 1; k++)\n" +
                "\n" +
                "            {\n" +
                "                System.out.print(\"c\");\n" +
                "            }\n" +
                "\n" +
                "            System.out.println();";

        EditText et_pattern, et_code;

        et_pattern = findViewById(R.id.et_pattern);
        et_code = findViewById(R.id.et_code);

        et_pattern.setText(pattern.toString());
        et_code.setText(code.toString());

        et_pattern.setKeyListener(null);//Making touch useless
        et_code.setKeyListener(null);

    }
}
