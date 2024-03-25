package com.empire.researchcomputeracademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DcimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dcim);


        TextView courseContent3=findViewById(R.id.dcim);
        courseContent3.setText("•\tComputer Accountant\n" +
                "•\tEnglish Speaking\n" +
                "•\tStage Daring\n" +
                "•\tComputer Hardware\n" +
                "•\tOffice Assistant\n" +
                "•\tGraphic Designer\n");
    }
}