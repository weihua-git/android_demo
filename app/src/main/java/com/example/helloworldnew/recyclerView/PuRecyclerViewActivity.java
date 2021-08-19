package com.example.helloworldnew.recyclerView;

import static com.example.helloworldnew.R.dimen.doviderHeight;
import static com.example.helloworldnew.R.dimen.doviderHeight2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.helloworldnew.R;

public class PuRecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mRvPu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu_recycler_view);

        mRvPu = findViewById(R.id.rv_pu);
        // StaggeredGridLayoutManager.VERTICAL 垂直
        mRvPu.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        mRvPu.addItemDecoration(new MyDecoration());
        mRvPu.setAdapter(new StaggeredGridApter(PuRecyclerViewActivity.this, new StaggeredGridApter.OnItemCLickListener() {
            @Override
            public void onclick(int pos) {
                Toast.makeText(PuRecyclerViewActivity.this, "click:" + pos, Toast.LENGTH_SHORT).show();
            }
        }));


    }

    class MyDecoration extends RecyclerView.ItemDecoration {
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            int gap = getResources().getDimensionPixelOffset(doviderHeight2);
            outRect.set(gap, gap, gap, gap);
        }
    }
}