package com.empire.researchcomputeracademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProgrammingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming);

        TextView courseContent4=findViewById(R.id.program);
        courseContent4.setText("•\tC Language\n" +
                "•\tC++ Language\n" +
                "•\tJava\n" +
                "•\tHTML\n" +
                "•\tJavaScript\n" +
                "•\tPHP\n" +
                "•\tPython\n" +
                "•\tAndroid studio\n" +
                "•\tV.B.\n" +
                "•\tOracle\n" +
                "•\tdata structure\n");
    }
}