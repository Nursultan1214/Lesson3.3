package com.example.lesson33;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter <Adapter.ViewHolder> {

    ArrayList<Model> list = new ArrayList<>();
    private OnCLick onCLick;

    public void setList(ArrayList<Model> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    public void setList(ArrayList<Model> list, OnCLick onCLick) {
        this.list.addAll(list);
        this.onCLick = onCLick;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull  Adapter.ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageView;
        private final TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imvIg);
            textView = itemView.findViewById(R.id.tv_australia);
        }

        public void bind(Model model) {
            imageView.setImageResource(model.getImage());
            textView.setText(model.getCounter());
            itemView.setOnClickListener(v -> onCLick.onItemClick(model));
        }
    }
        public interface OnCLick{
            void onItemClick(Model model);
    }
}
