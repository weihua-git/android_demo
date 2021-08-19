package com.example.helloworldnew.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.helloworldnew.R;

/**
 * mLv1.setAdapter(new MyListAdapter(ListViewActivity.this)); 设置一个适配器
 * MyListAdapter 找这个类
 */
public class ListViewActivity extends Activity {

    private ListView mLv1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        mLv1 = findViewById(R.id.lv_1);
        mLv1.setAdapter(new MyListAdapter(ListViewActivity.this));

        // 点击事件 i第几个第几行l
        mLv1.setOnItemClickListener((AdapterView<?> adapterView, View view, int i, long l) -> {
            Toast.makeText(ListViewActivity.this, "pos" + i, Toast.LENGTH_SHORT).show();
        });
        // 长按事件
        mLv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this, "长按 pos" + i, Toast.LENGTH_SHORT).show();
                return true; // 我处理完了
            }
        });

    }
}
