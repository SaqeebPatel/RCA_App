package com.empire.researchcomputeracademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CccplusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cccplus);
        TextView courseContent2=findViewById(R.id.cccplus);
        courseContent2.setText("•\tFundamental (Computer,Windows,Linux)\n" +
                "•\tEnglish & Marathi Typing\n" +
                "•\tWindows 2007,2010\n" +
                "•\tMS-Word 2013-16\n" +
                "•\tMS -Excel Expert 2013-16\n" +
                "•\tMS-Power Point 2013-16\n" +
                "•\tMS-Access Point 2013-16\n" +
                "•\tMS-Front Page\n" +
                "•\tMS-Outlook\n" +
                "•\tInternet\n" +
                "•\tOnline Banking, E-Commerce\n" +
                "•\tHardware\n" +
                "•\tMultimedia (Recording,Video Conference)\n");
    }

}