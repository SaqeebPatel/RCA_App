package com.empire.researchcomputeracademy.Authentication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.empire.researchcomputeracademy.User.MainActivity;
import com.empire.researchcomputeracademy.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    private EditText eMail, password;
    private Button loginBtn;
    private TextView link;

    ProgressDialog pd ;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eMail = findViewById(R.id.login_email);
        password = findViewById(R.id.login_password);
        loginBtn = findViewById(R.id.studLoginBtn);


        link = findViewById(R.id.registerLink);

        firebaseAuth = FirebaseAuth.getInstance();

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str_mail = eMail.getText().toString().trim();
                String str_pass = password.getText().toString().trim();

                if (TextUtils.isEmpty(str_mail) || TextUtils.isEmpty(str_pass) )
                {
                    Toast.makeText(LoginActivity.this,"All Fields are required!",Toast.LENGTH_SHORT).show();

                }else {

                    firebaseAuth.signInWithEmailAndPassword(str_mail,str_pass)
                            .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful())
                                    {
                                        pd =  new ProgressDialog(LoginActivity.this);
                                        pd.setMessage("Logging In...");
                                        pd.show();

                                        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference()
                                                .child("Users").child("Students").child(Objects.requireNonNull(firebaseAuth.getCurrentUser()).getUid());

                                        databaseReference.addValueEventListener(new ValueEventListener() {
                                            @Override
                                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                                                pd.dismiss();
                                                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                                startActivity(intent);
                                                finish();

                                            }

                                            @Override
                                            public void onCancelled(@NonNull DatabaseError databaseError) {

                                            }
                                        });



                                    }else {

                                        Toast.makeText(LoginActivity.this,"Incorrect Email or Password!",Toast.LENGTH_SHORT).show();
                                    }

                                }
                            });
                }

            }
        });

    }
}