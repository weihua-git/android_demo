package com.example.helloworldnew;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloworldnew.gridview.GridViewActivity;
import com.example.helloworldnew.listview.ListViewActivity;
import com.example.helloworldnew.recyclerView.LinearRecuclerViewActivity;
import com.example.helloworldnew.recyclerView.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;
    private Button mBtnRecuclerView;
    private Button mBtnWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnButton = findViewById(R.id.btn_botton);
        mBtnEditText = findViewById(R.id.btn_edittext);
        mBtnRadioButton = findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = findViewById(R.id.btn_check_box);
        mBtnImageView = findViewById(R.id.btn_imageview);
        mBtnListView = findViewById(R.id.btn_listview);
        mBtnGridView = findViewById(R.id.btn_gridview);
        mBtnRecuclerView = findViewById(R.id.btn_recuclerview);
        mBtnWebView = findViewById(R.id.btn_webview);
        setListeners();
    }

    private void setListeners() {
        onClick onClick = new onClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnGridView.setOnClickListener(onClick);
        mBtnRecuclerView.setOnClickListener(onClick);
        mBtnWebView.setOnClickListener(onClick);
    }

    private class onClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_textview:
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_botton:
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_check_box:
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_recuclerview:
                    intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                    break;
                case R.id.btn_webview:
                    intent = new Intent(MainActivity.this, WebViewActivity.class);
                    break;
            }
            if (intent == null) {
                Log.e("intent is null", "");
            }
            startActivity(intent);
        }

    }
}