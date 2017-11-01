package com.example.georgehigbie.devswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.example.georgehigbie.devswag.Adapters.ProductsAdapter
import com.example.georgehigbie.devswag.R
import com.example.georgehigbie.devswag.Services.DataService
import com.example.georgehigbie.devswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

        val layoutManager = GridLayoutManager(this, 2)
        productsList.layoutManager = layoutManager
        productsList.adapter = adapter
    }
}
