package com.example.georgehigbie.devswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
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
        categoriesList.setOnItemClickListener { parent, view, position, id ->
            val category = DataService.categories[position]
            var toastMessage = "You clicked on the ${category.title} cell"
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
        }
    }

}
