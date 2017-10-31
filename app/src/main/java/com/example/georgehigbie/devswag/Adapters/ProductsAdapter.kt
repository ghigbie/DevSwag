package com.example.georgehigbie.devswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.example.georgehigbie.devswag.Model.Product

/**
 * Created by georgehigbie on 10/30/17.
 */
class ProductsAdapter(val context: Context, val products: List<Product>) : RecyclerView.Adapter<ProductsAdapter.ProductHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    inner class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView){
        val productImage = itemView?.findViewById<>()
    }
}