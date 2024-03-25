package com.empire.researchcomputeracademy.User;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.empire.researchcomputeracademy.R;
import com.empire.researchcomputeracademy.adapter.FeedbackAdapter;
import com.empire.researchcomputeracademy.data.FeedbackData;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FeedbackFragment extends Fragment {



    public FeedbackFragment() {
        // Required empty public constructor
    }

    FloatingActionButton fab;
    AlertDialog alertDialog;
    AlertDialog.Builder builder;

    private EditText name, course, feedback;
    private Button submit;

    private RecyclerView recyclerView;
    private FeedbackAdapter adapter;
    private ArrayList<FeedbackData> list;

    private DatabaseReference reference, dbRef;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_feedback, container, false);

        recyclerView = view.findViewById(R.id.feedback_recycler);

        fab = view.findViewById(R.id.add_feedback);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            addPopupMenu();
            }
        });

        reference = FirebaseDatabase.getInstance().getReference();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        getFeedbacks();

        return view;
    }

    private void getFeedbacks() {
        reference.child("Feedback").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list = new ArrayList<>();
                for (DataSnapshot snapshot1: snapshot.getChildren()){
                    FeedbackData data = snapshot1.getValue(FeedbackData.class);
                    list.add(data);
                }

                adapter = new FeedbackAdapter(getContext(),list);
                adapter.notifyDataSetChanged();
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getContext() , error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addPopupMenu() {
        builder = new AlertDialog.Builder(getContext());
        View view = getLayoutInflater().inflate(R.layout.popup,null);

        name =view.findViewById(R.id.name);
        course = view.findViewById(R.id.course);
        feedback = view.findViewById(R.id.feedback);
        submit = view.findViewById(R.id.submitBtnFeedback);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!name.getText().toString().isEmpty()
                        && !course.getText().toString().isEmpty()
                        && !feedback.getText().toString().isEmpty()
                ){

                    String name1 = name.getText().toString();
                    String course1 = course.getText().toString();
                    String feedback1 = feedback.getText().toString();

                    dbRef = reference.child("Feedback");
                    final String uniqueKey = dbRef.push().getKey();

                    FeedbackData data  = new FeedbackData(feedback1,name1,course1);

                    dbRef.child(uniqueKey).setValue(data).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Snackbar.make(view,"Feedback Submitted Successfully!",Snackbar.LENGTH_SHORT).show();

                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    alertDialog.dismiss();
                                }
                            },1200);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Snackbar.make(view,e.getMessage(),Snackbar.LENGTH_SHORT).show();
                        }
                    });

                }else {
                    Snackbar.make(view,"All Fields Are Required!",Snackbar.LENGTH_SHORT).show();
                }
            }
        });

        builder.setView(view);
        alertDialog = builder.create();
        alertDialog.show();

    }







}