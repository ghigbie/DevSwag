package com.example.georgehigbie.devswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.georgehigbie.devswag.Model.Category
import com.example.georgehigbie.devswag.R

/**
 * Created by georgehigbie on 10/29/17.
 */
class CategoryRecycleAdapter(val context: Context, val categories: List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>(){

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryText)

        fun bindCategory(category: Category, context: Context){
            val resourceId = context.resources.getIdentifier(category.image,
                    "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title

        }
    }
}