package com.example.helloworldnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mBtn3;
    private TextView mTv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        mBtn3 = findViewById(R.id.btn_3);
        mBtn3.setOnClickListener(v -> Toast.makeText(ButtonActivity.this, "btn3我被点击啦", Toast.LENGTH_SHORT).show());

        mTv1 = findViewById(R.id.tv_1);

        mTv1.setOnClickListener(v -> Toast.makeText(ButtonActivity.this, "tv1被点击了", Toast.LENGTH_SHORT).show());
    }

    public void showTost(View view) {
        Toast.makeText(this, "btn4我被点击啦", Toast.LENGTH_SHORT).show();
    }
}