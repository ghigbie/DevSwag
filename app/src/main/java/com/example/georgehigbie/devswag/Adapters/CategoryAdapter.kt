package com.example.georgehigbie.devswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.georgehigbie.devswag.Model.Category
import com.example.georgehigbie.devswag.R

/**
 * Created by georgehigbie on 10/13/17.
 */

class CategoryAdapter() : BaseAdapter(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItem(position: Int): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemId(position: Int): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
//class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter(){
//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        val categoryView : View
//        val holder : ViewHolder
//
//        if (convertView == null){
//            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
//            holder = ViewHolder()
//            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
//            holder.categoryName = categoryView.findViewById(R.id.categoryText)
//            println("I exist for the first time")
//            categoryView.tag = holder
//        }else{
//            holder = convertView.tag as ViewHolder
//            categoryView = convertView
//            println("GO GREEN!")
//        }
//
//        val category = categories[position]
//
//        val resourceID = context.resources.getIdentifier(category.image, "drawable", context.packageName)
//        holder.categoryImage?.setImageResource(resourceID)
//        holder.categoryName?.text = category.title
//        return categoryView
//    }
//
//    override fun getItem(position: Int): Any {
//        return categories[position]
//    }
//
//    override fun getItemId(position: Int): Long {
//        return 0
//    }
//
//    override fun getCount(): Int {
//        return categories.count()
//    }
//
//
//    private class ViewHolder {
//        var categoryImage: ImageView? = null
//        var categoryName: TextView? = null
//    }
//
//}