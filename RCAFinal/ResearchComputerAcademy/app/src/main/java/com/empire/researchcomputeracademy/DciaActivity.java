package com.empire.researchcomputeracademy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DciaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dcia);
        TextView courseContent9=findViewById(R.id.dcia);
        courseContent9.setText("•\tEnglish & Marathi (30-40 WPM)\n" +
                "•\tCCC++\n" +
                "•\tMaster in Tally\n" +
                "\n" +
                "INTERNET :- \n" +
                "•\tBasic Concept of Internet\n" +
                "•\tMaking E-mail ID\n" +
                "•\tSending & Receiving E-mail\n" +
                "•\tSurfing & Chatting \n" +
                "•\tUploading & Downloading Attachment\n" +
                "•\tBrowsing Web Site Net Banking, E-Commerce\n" +
                "\n" +
                "HARDWARE :-\n" +
                "•\tNetworking\n" +
                "•\tPC Assembling\n" +
                "•\tHow to Connect Computer Part\n" +
                "•\tPrinter, Web Camera & Other Part Installation\n" +
                "•\tSystem & Application Software Installation\n" +
                "\n" +
                "OFFICE SKILL :-\n" +
                "•\tOffice Routine\n" +
                "•\tBusiness Procedures\n" +
                "•\tBanking\n" +
                "•\tLetter Drafting . Communication\n" +
                "•\tPersonality Development.\n" +
                "•\tSecretarial Personality\n" +
                "•\tJob Interview\n" +
                "•\tDaily office routine works\n" +
                "•\tAccounting.\n" +
                "•\tOther works in selected packages\n");
    }
}