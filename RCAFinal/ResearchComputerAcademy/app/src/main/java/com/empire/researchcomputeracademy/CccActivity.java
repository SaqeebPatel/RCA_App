package com.empire.researchcomputeracademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CccActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccc);



        TextView courseContent1=  findViewById(R.id.ccc);
        courseContent1.setText("•\tFundamental (Computer,Windows,Linux)\n" +
                "•\tWindows 2007\n" +
                "•\tMS-Word\n" +
                "•\tMS-Excel\n" +
                "•\tMS-Power Point\n" +
                "•\tInternet\n" +
                "•\t40 Hours practical + 40 Hours Theory\n");
    }
}