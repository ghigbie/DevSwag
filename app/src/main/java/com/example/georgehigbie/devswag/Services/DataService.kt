package com.example.georgehigbie.devswag.Services

import com.example.georgehigbie.devswag.Model.Category
import com.example.georgehigbie.devswag.Model.Product

/**
 * Created by georgehigbie on 10/11/17.
 */

object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HAT", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HAT", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HAT", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HAT", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HAT", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devsolpes Graphic Beanie", "$18", "hat1"),
            Product("Devsolpes Hat Blue", "$28", "hat2"),
            Product("Devsolpes Hat White", "$18", "hat3"),
            Product("Devsolpes Hat Snapback", "$23", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Blue", "$29", "hoodie2"),
            Product("Devslopes Hoodie Orange", "$32", "hoodie3"),
            Product("Devslopes Hoodie Black", "$26", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Gray", "$15", "shirt1"),
            Product("Devslopes Badge Light Blue", "$16", "shirt2"),
            Product("Devslopes Logo Shirt Orange", "$16", "shirt3"),
            Product("Devslopes Hustle", "$18", "shirt4"),
            Product("Kick Flip Studios", "$19", "shirt5")
    )



}