package com.prasanga.fdo.asteriskpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Pattern3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern3);
        getSupportActionBar().setTitle("Pattern #3");

        String pattern = "" +
                "\n      *" +
                "\n     * *";
        String code = "int c = 1;\n" +
                "        for (int i = 1; i <= 5; i++) {\n" +
                "            for (int j = i; j < 5; j++) {\n" +
                "                System.out.print(\" \");\n" +
                "            }\n" +
                "            for (int k = 1; k <= c; k++) {\n" +
                "                if (k % 2 == 0)\n" +
                "                    System.out.print(\" \");\n" +
                "                else\n" +
                "                    System.out.print(\"*\");\n" +
                "            }\n" +
                "            System.out.println();\n" +
                "            c += 2;\n" +
                "        }";

        EditText et_pattern, et_code;

        et_pattern = findViewById(R.id.et_pattern);
        et_code = findViewById(R.id.et_code);

        et_pattern.setText(pattern.toString());
        et_code.setText(code.toString());

        et_pattern.setKeyListener(null);//Making touch useless
        et_code.setKeyListener(null);
    }
}
