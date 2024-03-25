package com.empire.rcaadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private Button delNotice, UpNotice, UpImage, UpPdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        delNotice = findViewById(R.id.delete_notice);
        UpImage = findViewById(R.id.add_image);
        UpNotice = findViewById(R.id.add_notice);
        UpPdf = findViewById(R.id.upload_pdf);

        delNotice.setOnClickListener(this);
        UpPdf.setOnClickListener(this);
        UpNotice.setOnClickListener(this);
        UpImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.add_image:
                startActivity(new Intent(MainActivity.this,AddImageActivity.class));
                break;
            case R.id.add_notice:
                startActivity(new Intent(MainActivity.this,UploadNoticeActivity.class));
                break;
            case R.id.upload_pdf:
                startActivity(new Intent(MainActivity.this,AddPdfActivity.class));
                break;
            case R.id.delete_notice:
                startActivity(new Intent(MainActivity.this,DeleteNoticeActivity.class));
                break;
        }
    }
}