package com.example.georgehigbie.devswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.georgehigbie.devswag.Adapters.CategoryAdapter
import com.example.georgehigbie.devswag.R
import com.example.georgehigbie.devswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoriesList.adapter = adapter
    }
}
