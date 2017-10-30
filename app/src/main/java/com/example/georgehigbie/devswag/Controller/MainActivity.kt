package com.example.georgehigbie.devswag.Controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.georgehigbie.devswag.Adapters.CategoryRecycleAdapter
import com.example.georgehigbie.devswag.R
import com.example.georgehigbie.devswag.Services.DataService
import com.example.georgehigbie.devswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val productsIntent = Intent(this, ProductsActivity :: class.java)
            productsIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productsIntent)
        }
        categoriesList.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoriesList.layoutManager = layoutManager
        categoriesList.setHasFixedSize(true) //this is small optimization for cells that are of a set sized
    }

}
