package com.vmeshow.minepage

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.rv)
        val iconDataList = DataUtils.initIconDataList()
        val rvGridAdapter = RvGridAdapter(applicationContext, iconDataList)
        recyclerView.layoutManager = GridLayoutManager(this, 4)
        recyclerView.adapter = rvGridAdapter
        rvGridAdapter.setItemClickListener { position ->
//            Log.d("Mine", iconDataList[position].title)
            val intent = Intent(this@MainActivity, SkipActivity::class.java)
            intent.putExtra("title", iconDataList[position].title)
            startActivity(intent)
        }
    }
}