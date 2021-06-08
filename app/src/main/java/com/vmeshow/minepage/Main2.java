package com.vmeshow.minepage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.vmeshow.minepage.RvGridAdapter.OnItemClickListener;

import java.util.List;

public class Main2 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.rv);

        List<IconData> iconDataList = DataUtils.initIconDataList();
        RvGridAdapter rvGridAdapter = new RvGridAdapter(getApplicationContext(), iconDataList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.setAdapter(rvGridAdapter);
        rvGridAdapter.setItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Log.d("Mine", iconDataList.get(position).getTitle());

                Intent intent = new Intent(Main2.this, SkipActivity.class);
                intent.putExtra("title", iconDataList.get(position).getTitle());
                startActivity(intent);
            }
        });
    }
}
