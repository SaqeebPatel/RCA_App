package com.empire.researchcomputeracademy.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.empire.researchcomputeracademy.PdfOpenerActivity;
import com.empire.researchcomputeracademy.R;
import com.empire.researchcomputeracademy.data.EbookData;

import java.util.List;

public class EbookAdapter extends RecyclerView.Adapter<EbookAdapter.EbookViewHolder> {
    private Context context;
    private List<EbookData> list;

    public EbookAdapter(Context context, List<EbookData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public EbookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ebook_item_layout, parent, false);

        return new EbookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EbookViewHolder holder, int position) {

        holder.name.setText(list.get(position).getPdfTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PdfOpenerActivity.class);
                intent.putExtra("pdfUrl", list.get(position).getPdfUrl());
                context.startActivity(intent);
            }
        });

        holder.download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(list.get(position).getPdfUrl()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class EbookViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private ImageView download;

        public EbookViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.ebookName);
            download = itemView.findViewById(R.id.ebookDownload);
        }
    }
}