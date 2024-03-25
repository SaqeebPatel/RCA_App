package com.empire.researchcomputeracademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.empire.researchcomputeracademy.Authentication.RegisterActivity;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Animation splashAnimation = AnimationUtils.loadAnimation(this,R.anim.splash_animation);


        Thread mythread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(3000);
                    startActivity(new Intent(SplashActivity.this, RegisterActivity.class));
                    finish();


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        mythread.start();
    }
}