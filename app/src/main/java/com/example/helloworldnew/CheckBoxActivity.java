package com.example.helloworldnew;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox mCb5, mCb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        mCb5 = findViewById(R.id.cb_5);
        mCb6 = findViewById(R.id.cb_6);

        mCb5.setOnCheckedChangeListener((compoundButton, b) -> Toast.makeText(CheckBoxActivity.this, b ? "选中" : "未选中", Toast.LENGTH_SHORT).show());
        mCb6.setOnCheckedChangeListener((compoundButton, b) -> Toast.makeText(CheckBoxActivity.this, b ? "选中" : "未选中", Toast.LENGTH_SHORT).show());

    }
}