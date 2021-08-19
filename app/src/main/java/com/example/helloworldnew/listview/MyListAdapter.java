package com.example.helloworldnew.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.helloworldnew.R;

/**
 * extends BaseAdapter
 * ViewHolder 复用
 */
public class MyListAdapter extends BaseAdapter {

    private Context mContent;
    private LayoutInflater mLayoutInflater;

    public MyListAdapter(Context context) {
        this.mContent = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 1;
    }

    static class ViewHolder {
        public ImageView imageView;
        public TextView tvTitle, tvTime, tvContent;

    }

    @Override
    public View getView(int i, View converView, ViewGroup viewGroup) {

        ViewHolder holder;
        if (converView == null) {
            converView = mLayoutInflater.inflate(R.layout.layout_list_item, null);
            holder = new ViewHolder();
            holder.imageView = converView.findViewById(R.id.iv);
            holder.tvTitle = converView.findViewById(R.id.tv_title);
            holder.tvTime = converView.findViewById(R.id.tv_time);
            holder.tvContent = converView.findViewById(R.id.tv_content);
            converView.setTag(holder);
        } else {
            holder = (ViewHolder) converView.getTag();
        }
        // 给控件赋值
        holder.tvTitle.setText("这是标题");
        holder.tvTime.setText("2099-08-99");
        holder.tvContent.setText("这是内容");
        Glide.with(mContent).load("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png").into(holder.imageView);
        return converView;
    }
}
