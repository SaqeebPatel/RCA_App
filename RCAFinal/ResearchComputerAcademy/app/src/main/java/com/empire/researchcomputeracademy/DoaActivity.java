package com.empire.researchcomputeracademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DoaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);


        TextView courseContent= findViewById(R.id.doa);
        courseContent.setText("•\tEnglish Typing\n" +
                "•\tOperating\n" +
                "•\tComputer Fundamental\n" +
                "•\tWindows\n" +
                "•\tMs word 2019\n" +
                "•\tMs Excel 2019\n" +
                "•\tMs Power Point 2019\n" +
                "•\tMs Outlook\n" +
                "•\tInternet\n" +
                "•\tPhotoshop\n" +
                "•\tHardware\n" +
                "•\tMarathi Typing\n" +
                "•\tHindi Typing\n" +
                "•\tTally Prime+Tally ERP.9\n" +
                "•\tManual Accounting\n" +
                "•\tAccounting Features\n" +
                "•\tInventory Features\n" +
                "•\tTaxation With GST\n" +
                "•\tCompany Configuration\n" +
                "•\tBusy\n" +
                "•\tE-Way Bill\n" +
                "•\tOther Features\n" +
                "•\tCompany Logo\n" +
                "•\tGST: R1,3B,R4,M.More...\n" +
                "•\tOnline Banking\n");
    }
}