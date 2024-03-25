package com.empire.researchcomputeracademy.User;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.empire.researchcomputeracademy.AboutActivity;
import com.empire.researchcomputeracademy.Authentication.LoginActivity;
import com.empire.researchcomputeracademy.Authentication.RegisterActivity;
import com.empire.researchcomputeracademy.CoursesActivity;
import com.empire.researchcomputeracademy.GalleryActivity;
import com.empire.researchcomputeracademy.PdfActivity;
import com.empire.researchcomputeracademy.R;
import com.empire.researchcomputeracademy.SettingActivity;
import com.empire.researchcomputeracademy.TeacherActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bottomNavigationView;
    private NavController navController;


    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationMenuView;

    AlertDialog dialog;
    AlertDialog.Builder builder;

    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar_news);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Research Computer Academy");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        navController = Navigation.findNavController(this,R.id.frame_layout);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationMenuView = findViewById(R.id.navigation_view);
        toggle= new ActionBarDrawerToggle(this,drawerLayout,R.string.start,R.string.close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationMenuView.setNavigationItemSelectedListener(this);
        NavigationUI.setupWithNavController(bottomNavigationView,navController);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

          case R.id.teacher:
              startActivity(new Intent(MainActivity.this, TeacherActivity.class));
              break;
              case R.id.gallery:
                  startActivity(new Intent(MainActivity.this, GalleryActivity.class));
                  break;
            case R.id.courses:
            startActivity(new Intent(MainActivity.this, CoursesActivity.class));
            break;
            case R.id.about:
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
                break;
            case R.id.pdf:
                startActivity(new Intent(MainActivity.this, PdfActivity.class));
                break;
            case R.id.share:
                String body = "Install Research Computer Academy offical android application go get more information about the institute  " +
                        "https://play.google.com/store/apps/details?id=" + getPackageName();
                Intent intent2 = new Intent(Intent.ACTION_SEND);
                intent2.setType("text/plain");
                intent2.putExtra(Intent.EXTRA_SUBJECT,"Research Computer Academy");
                intent2.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(intent2,"Share Via..."));

                break;

            case R.id.logout:
                builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Log Out")
                        .setMessage("Are you sure wants to Logout ?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                FirebaseAuth.getInstance().signOut();
                                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                startActivity(intent);
                                finish();
                            }
                        }).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialog.cancel();
                    }
                });
                dialog = builder.create();
                dialog.show();

                break;
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return true;

    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onBackPressed() {


        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }

    }
}