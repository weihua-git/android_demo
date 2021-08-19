package com.example.helloworldnew.recyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworldnew.R;


public class RecyclerViewActivity extends AppCompatActivity {

    private Button mBtnLinear, mBtnHor, mBtnGrid, mBtnPu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mBtnLinear = findViewById(R.id.btn_linnar);
        mBtnHor = findViewById(R.id.btn_hor);
        mBtnGrid = findViewById(R.id.btn_grid);
        mBtnPu = findViewById(R.id.btn_pu);
        mBtnLinear.setOnClickListener(view -> {
            Intent intent = new Intent(RecyclerViewActivity.this, LinearRecuclerViewActivity.class);
            startActivity(intent);
        });
        mBtnHor.setOnClickListener(view -> {
            Intent intent = new Intent(RecyclerViewActivity.this, HoRecyclerViewActivity.class);
            startActivity(intent);
        });
        mBtnGrid.setOnClickListener(view -> {
            Intent intent = new Intent(RecyclerViewActivity.this, GridRecyclerViewActivity.class);
            startActivity(intent);
        });
        mBtnPu.setOnClickListener(view -> {
            Intent intent = new Intent(RecyclerViewActivity.this, PuRecyclerViewActivity.class);
            startActivity(intent);
        });
    }
}