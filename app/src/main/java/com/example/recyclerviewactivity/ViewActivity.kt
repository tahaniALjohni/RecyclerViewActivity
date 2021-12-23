package com.example.recyclerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ViewActivity : AppCompatActivity() {
    private lateinit var rvMainView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        rvMainView= findViewById(R.id.rvMainView)
        val adapter= RVAdapter()
        rvMainView.adapter= adapter
        rvMainView.layoutManager= LinearLayoutManager(this)
    }
}