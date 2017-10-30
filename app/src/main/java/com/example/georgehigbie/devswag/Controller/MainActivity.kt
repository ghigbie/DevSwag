package com.example.georgehigbie.devswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.georgehigbie.devswag.Adapters.CategoryRecycleAdapter
import com.example.georgehigbie.devswag.R
import com.example.georgehigbie.devswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoriesList.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoriesList.layoutManager = layoutManager
        categoriesList.setHasFixedSize(true)
    }

}
