package com.example.recyclermultipleviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RvAdapter extends RecyclerView.Adapter {

    ArrayList<RvModelClass> rvModelClasses;
    Context context;


    public RvAdapter(ArrayList<RvModelClass> rvModelClasses, Context context) {
        this.rvModelClasses = rvModelClasses;
        this.context = context;
    }

    public static class ImageTypeViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public ImageTypeViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textView = itemView.findViewById(R.id.textView);
            this.imageView = itemView.findViewById(R.id.imageView);
        }
    }

    public static class TextTypeViewHolder extends RecyclerView.ViewHolder {
        TextView txtYear;
        TextView txtDes;
        public TextTypeViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtYear = itemView.findViewById(R.id.textView2);
            this.txtDes = itemView.findViewById(R.id.textView3);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        switch (viewType) {
            case RvModelClass.IMAGE_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_view_one, parent, false);
                return new ImageTypeViewHolder(view);
            case RvModelClass.TEXT_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_view_two, parent, false);
                return new TextTypeViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RvModelClass objRvModelClass = rvModelClasses.get(position);
        if (objRvModelClass != null) {
            switch (objRvModelClass.type) {
                case RvModelClass.IMAGE_TYPE:
                    ((ImageTypeViewHolder) holder).textView.setText(objRvModelClass.text);
                    ((ImageTypeViewHolder) holder).imageView.setImageResource(objRvModelClass.poster);
                    break;
                case RvModelClass.TEXT_TYPE:
                    ((TextTypeViewHolder) holder).txtYear.setText(objRvModelClass.title);
                    ((TextTypeViewHolder) holder).txtDes.setText(objRvModelClass.des);
                    break;
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        switch (rvModelClasses.get(position).type) {
            case 0:
                    return RvModelClass.TEXT_TYPE;
            case 1:
                return RvModelClass.IMAGE_TYPE;
        }
        return -1;
    }

    @Override
    public int getItemCount() {
        return rvModelClasses.size();
    }
}
