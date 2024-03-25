package com.empire.researchcomputeracademy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class CoursesActivity extends AppCompatActivity {
    Toolbar toolbar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        toolbar = findViewById(R.id.toolbar_courses);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Courses");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);






        TextView courseContent9=findViewById(R.id.course_content9);
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

        TextView courseContent= findViewById(R.id.course_content);
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
          TextView courseContent1=  findViewById(R.id.course_content1);
          courseContent1.setText("•\tFundamental (Computer,Windows,Linux)\n" +
                  "•\tWindows 2007\n" +
                  "•\tMS-Word\n" +
                  "•\tMS-Excel\n" +
                  "•\tMS-Power Point\n" +
                  "•\tInternet\n" +
                  "•\t40 Hours practical + 40 Hours Theory\n");

          TextView courseContent2=findViewById(R.id.course_content2);
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

          TextView courseContent3=findViewById(R.id.course_content3);
          courseContent3.setText("•\tComputer Accountant\n" +
                  "•\tEnglish Speaking\n" +
                  "•\tStage Daring\n" +
                  "•\tComputer Hardware\n" +
                  "•\tOffice Assistant\n" +
                  "•\tGraphic Designer\n");
        TextView courseContent4=findViewById(R.id.course_content4);
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
        TextView courseContent5=findViewById(R.id.course_content5);
        courseContent5.setText("Tally Erp9 Duration :-\n" +
                "•\tBesic of Accouting\n" +
                "•\tAccounting with Tally ERP.9\n" +
                "•\tInventory Features Sales Management\n" +
                "•\tPurchase Management\n" +
                "•\tAdditional Vouchers\n" +
                "•\tStatutory & Taxation\n" +
                "•\tTax Configuration\n" +
                "•\tReport & Printing\n" +
                "•\tBackup & Restore\n" +
                "\n" +
                "Tally ERP9 :-\n" +
                "•\tDuration: 4 Month\n" +
                "•\tTally Erp 9 (2month's)+\n" +
                "•\tAccounting Features\n" +
                "•\tStorage & Classification\n" +
                "•\tStatutory & Taxation with Calculation\n" +
                "•\tTax Configuration Other Features\n" +
                "•\tInternet\n" +
                "•\tCompulsory Job Training\n" +
                "\n" +
                " EXPERT TALLY for GST :-\n" +
                "•\tTally Erp 9 (4Month's)+ Advance Excel Expert\n" +
                "•\tEnglish Typing+(Marathi Typing*)\n" +
                "•\tAccounting Features F11 (F1,F2, F3) \n" +
                "•\tOutstanding Management\n" +
                "•\tMulti Currency, Scenario Managements\n" +
                "•\tCost Centers & budgets\n" +
                "•\tInvoicing\n" +
                "•\tTax Configuration Other Features\n" +
                "•\tTally Setting option\n" +
                "•\tMigration Data From Tally 7.2 to Tally erp9\n" +
                "•\tTally Erp 9 For SMS\n" +
                "•\tAudit Features \n" +
                "•\tTaxation lecture\n" +
                "•\tManual Accounting & Taxation\n" +
                "•\tE-Tax\n" +
                "•\tOnline Banking E-Commerse \n" +
                "•\tAccounting with Industrials Software\n" +
                "•\tTotal Practical Knowledge \n" +
                "•\tOne Year Final Balance sheet Project file\n" +
                "•\tFile Submissions\n");

        TextView courseContent6=findViewById(R.id.course_content6);
        courseContent6.setText("•\tNetworking\n" +
                "•\tPC Assembling\n" +
                "•\tHow to Connect Computer Part\n" +
                "•\tPrinter, Web Camera & Other Part Installation\n" +
                "•\tSystem & Application Software Installation\n");

        TextView courseContent7=findViewById(R.id.course_content7);
        courseContent7.setText("•\tEnglish & Marathi\n" +
                "(30-40 WPM)\n" +
                "•\tEnglish & Marathi\n" +
                "(40-60 WPM)\n");

        TextView courseContent8=findViewById(R.id.course_content8);
        courseContent8.setText("•\tMs-Word\n" +
                "•\tMs-Excel\n" +
                "•\tMs-Power Point\n" +
                "•\tMs- Access\n");

        TextView courseContent10=findViewById(R.id.course_content10);
        courseContent10.setText("•\tD.C.P.\n" +
                "•\tB.O.P.\n" +
                "•\tC\n" +
                "•\tC++\n" +
                "•\tV.B.\n" +
                "•\tJava\n" +
                "•\tPHP\n" +
                "•\tOracle\n" +
                "•\tData Structure\n" +
                "•\tHardware\n" +
                "•\tNetworking\n" +
                "•\tD.T.P.\n");

       TextView courseContent11=findViewById(R.id.course_content11);
        courseContent11.setText("•\tBesic of Accouting\n" +
                "•\tAccounting with Tally ERP.9\n" +
                "•\tInventory Features Sales Management\n" +
                "•\tPurchase Management\n" +
                "•\tAdditional Vouchers\n" +
                "•\tStatutory & Taxation\n" +
                "•\tTax Configuration\n" +
                "•\tReport & Printing\n" +
                "•\tBackup & Restore\n" +
                "\n");

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home){
            finish();
        }


        return super.onOptionsItemSelected(item);
    }
}