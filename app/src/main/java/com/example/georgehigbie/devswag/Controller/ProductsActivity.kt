package com.example.georgehigbie.devswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.georgehigbie.devswag.R
import com.example.georgehigbie.devswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        intent.getStringExtra(EXTRA_CATEGORY)
    }
}
