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

public class LineardApter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContent;
    private OnItemCLickListener mListener;

    private List<String> list;

    public LineardApter(Context mContent, OnItemCLickListener listener) {
        this.mContent = mContent;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            return new LinearViewHolder(LayoutInflater.from(mContent).inflate(R.layout.activty_linear_recucler_item, parent, false));
        }
        return new LinearViewHolder2(LayoutInflater.from(mContent).inflate(R.layout.activty_linear_recucler_item2, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == 0) {
            ((LinearViewHolder) holder).textView.setText("HelloWorld!");
        } else {
            ((LinearViewHolder2) holder).textView.setText("天哥在奔跑!");
        }
        holder.itemView.setOnClickListener(view -> {
            mListener.onclick(position);
        });
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
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

    public class LinearViewHolder2 extends RecyclerView.ViewHolder {

        private TextView textView;

        private ImageView imageView;

        public LinearViewHolder2(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
            imageView = itemView.findViewById(R.id.iv_image);

        }
    }

    public interface OnItemCLickListener {
        void onclick(int pos);
    }
}
