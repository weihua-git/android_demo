package com.example.helloworldnew.gridview;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworldnew.R;

public class GridViewActivity extends AppCompatActivity {
    private GridView mGv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        mGv = findViewById(R.id.gv_grid);
        mGv.setAdapter(new MyGridViewAdapter(GridViewActivity.this));
        mGv.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(GridViewActivity.this, "点击 pos：" + i, Toast.LENGTH_SHORT).show());

        mGv.setOnItemLongClickListener((adapterView, view, i, l) -> {
            Toast.makeText(GridViewActivity.this, "长按 pos：" + i, Toast.LENGTH_SHORT).show();
            return true;
        });
    }
}
