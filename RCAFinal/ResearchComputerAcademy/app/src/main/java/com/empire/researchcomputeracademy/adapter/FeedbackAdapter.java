package com.empire.researchcomputeracademy.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.empire.researchcomputeracademy.R;
import com.empire.researchcomputeracademy.data.FeedbackData;
import com.empire.researchcomputeracademy.data.NoticeData;

import java.util.ArrayList;



public class FeedbackAdapter extends RecyclerView.Adapter<FeedbackAdapter.FeedbackViewHolder> {

    private Context context;
    private ArrayList<FeedbackData> list;

    public FeedbackAdapter(Context context, ArrayList<FeedbackData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public FeedbackAdapter.FeedbackViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.feedback_row,parent,false);
        return new FeedbackViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedbackAdapter.FeedbackViewHolder holder, int position) {

        FeedbackData currentItem = list.get(position);

        holder.name.setText(currentItem.getStudentName());
        holder.course.setText(currentItem.getCourse());
        holder.feedback.setText(currentItem.getTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class FeedbackViewHolder extends RecyclerView.ViewHolder {

        private TextView name,course, feedback;

        public FeedbackViewHolder(@NonNull View itemView) {
            super(itemView);

            name= itemView.findViewById(R.id.name_row);
            course = itemView.findViewById(R.id.course_row);
            feedback = itemView.findViewById(R.id.feedback_row);
        }
    }
}
