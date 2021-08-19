package com.example.helloworldnew.recyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworldnew.R;

import java.util.List;

public class HorApter extends RecyclerView.Adapter<HorApter.LinearViewHolder> {

    private Context mContent;
    private OnItemCLickListener mListener;

    private List<String> list;

    public HorApter(Context mContent, OnItemCLickListener listener) {
        this.mContent = mContent;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public HorApter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContent).inflate(R.layout.activty_hor_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinearViewHolder holder, int position) {
        holder.textView.setText("Hello");
        holder.itemView.setOnClickListener(view -> {
            mListener.onclick(position);
        });
    }


    @Override
    public int getItemCount() {
        return 30;
        // list.size()
    }

    public class LinearViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public LinearViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }
    }

    public interface OnItemCLickListener {
        void onclick(int pos);
    }
}
