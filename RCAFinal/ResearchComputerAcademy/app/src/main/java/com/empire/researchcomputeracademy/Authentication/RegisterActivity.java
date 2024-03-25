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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private FirebaseUser firebaseUser;
    ProgressDialog pd;
    DatabaseReference reference;

    protected void onStart() {
        super.onStart();

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();


        //redirect if user is not null
        if(firebaseUser != null)
        {
            startActivity(new Intent(RegisterActivity.this, MainActivity.class));
            finish();
        }
    }

    private EditText registerName, registerMail, registerPass;
    private Button registerBtn;
    private TextView loginText;
    private FloatingActionButton floatingActionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerBtn = findViewById(R.id.studRegBtn);
        registerName = findViewById(R.id.studRegNameEd);
        registerMail = findViewById(R.id.studRegEmailEd);
        registerPass = findViewById(R.id.studRegPassEd);
        loginText = findViewById(R.id.studLoginHereText);


        firebaseAuth = FirebaseAuth.getInstance();

        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });



        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_name = registerName.getText().toString().trim();
                String str_email = registerMail.getText().toString().trim();
                String str_pass = registerPass.getText().toString().trim();

                if (TextUtils.isEmpty(str_name) || TextUtils.isEmpty(str_email) || TextUtils.isEmpty(str_pass))
                {
                    Toast.makeText(RegisterActivity.this,"All fields are required !",Toast.LENGTH_SHORT).show();
                }else if (str_pass.length()<6)
                {
                    Toast.makeText(RegisterActivity.this,"Password must have 6 characters !",Toast.LENGTH_SHORT).show();
                }else {
                    register(str_name,str_email,str_pass);
                }
            }
        });
    }

    private void register(String name, String email, String password) {

        firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful())
                        {

                            pd = new ProgressDialog(RegisterActivity.this);
                            pd.setMessage("Creating Student Account...");
                            pd.show();

                            firebaseUser = firebaseAuth.getCurrentUser();
                            String userId = firebaseUser.getUid();

                            reference = FirebaseDatabase.getInstance().getReference().child("Users").child("Students").child(userId);

                            HashMap<String,Object> hashMap = new HashMap<>();
                            hashMap.put("id",userId);
                            hashMap.put("name",name);
                            hashMap.put("email",email);



                            reference.setValue(hashMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {

                                    if (task.isSuccessful())
                                    {
                                        pd.dismiss();
                                        Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
                                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                        startActivity(intent);

                                        Toast.makeText(RegisterActivity.this,"Account Created Successfully!",Toast.LENGTH_LONG).show();
                                    }
                                }
                            });

                        }else
                        {
                            Toast.makeText(RegisterActivity.this,"Error: "+task.getException()
                                    ,Toast.LENGTH_SHORT).show();
                        }

                    }
                });

    }
}