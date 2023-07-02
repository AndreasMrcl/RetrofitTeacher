package com.example.retrofitteacher.ADAPTOR;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitteacher.MODEL.ModelTeacher;
import com.example.retrofitteacher.R;

import java.util.ArrayList;

public class AdaptorTeacher extends RecyclerView.Adapter<AdaptorTeacher.myViewHolder> {
    ArrayList<ModelTeacher> modelTeacherArrayList;

    public AdaptorTeacher(ArrayList<ModelTeacher> modelTeacherArrayList) {
        this.modelTeacherArrayList = modelTeacherArrayList;
    }


    @NonNull
    @Override
    public AdaptorTeacher.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.format_teacher,parent,false);
        return new AdaptorTeacher.myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorTeacher.myViewHolder holder, int position) {
        holder.tvcode.setText(modelTeacherArrayList.get(position).getKode());
        holder.tvname.setText(modelTeacherArrayList.get(position).getNama());
        holder.tvposition.setText(modelTeacherArrayList.get(position).getPosisi());
    }

    @Override
    public int getItemCount() {
        return modelTeacherArrayList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView tvname, tvposition, tvcode;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            tvcode = itemView.findViewById(R.id.tvCode);
            tvname = itemView.findViewById(R.id.tvName);
            tvposition = itemView.findViewById(R.id.tvPosition);

        }
    }
}
