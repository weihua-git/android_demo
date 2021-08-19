package com.example.helloworldnew.recyclerView;

import static com.example.helloworldnew.R.dimen.doviderHeight;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.helloworldnew.R;

public class LinearRecuclerViewActivity extends AppCompatActivity {

    private RecyclerView mRvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recucler_view);
        mRvMain = findViewById(R.id.rv_main);
        mRvMain.addItemDecoration(new MyDecoration());
        mRvMain.setLayoutManager(new LinearLayoutManager(LinearRecuclerViewActivity.this));
        mRvMain.setAdapter(new LineardApter(LinearRecuclerViewActivity.this, pos -> {
            Toast.makeText(LinearRecuclerViewActivity.this, "click" + pos, Toast.LENGTH_SHORT).show();
        }));
    }

    class MyDecoration extends RecyclerView.ItemDecoration {
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0, 0, 0, getResources().getDimensionPixelOffset(doviderHeight));
        }
    }
}