package com.example.georgehigbie.devswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.georgehigbie.devswag.Adapters.CategoryAdapter
import com.example.georgehigbie.devswag.Model.Category
import com.example.georgehigbie.devswag.R
import com.example.georgehigbie.devswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                DataService.categories)
        categoriesList.adapter = adapter
    }

}
