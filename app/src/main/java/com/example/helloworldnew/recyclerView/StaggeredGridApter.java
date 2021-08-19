package com.example.helloworldnew.recyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworldnew.R;

import java.util.List;

public class StaggeredGridApter extends RecyclerView.Adapter<StaggeredGridApter.LinearViewHolder> {

    private Context mContent;
    private OnItemCLickListener mListener;

    private List<String> list;

    public StaggeredGridApter(Context mContent, OnItemCLickListener listener) {
        this.mContent = mContent;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public StaggeredGridApter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContent).inflate(R.layout.activty_staggered_grid_recyclerview_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinearViewHolder holder, int position) {
        if (position % 2 != 0) {
            holder.imageView.setImageResource(R.drawable.meinv);
        } else {
            holder.imageView.setImageResource(R.drawable.hua);
        }

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

        private ImageView imageView;

        public LinearViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
        }
    }

    public interface OnItemCLickListener {
        void onclick(int pos);
    }
}
