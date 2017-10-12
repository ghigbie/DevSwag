package com.example.georgehigbie.devswag.Services

import com.example.georgehigbie.devswag.Model.Category
import com.example.georgehigbie.devswag.Model.Product

/**
 * Created by georgehigbie on 10/11/17.
 */

object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES","hoodieiamge"),
            Category("HAT", "hatimage"),
            Category("DIGITAL", "digitalgoodimage")
    )

    val hats = listOf(
            Product("Devsolpes Graphic Beanie", "$18", "hat01"),
            Product("Devsolpes Hat Blue", "$28", "hat02"),
            Product("Devsolpes Hat White", "$18", "hat03"),
            Product("Devsolpes Hat Snapback", "$23", "hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Blue", "$29", "hoodie02"),
            Product("Devslopes Hoodie Orange", "$32", "hoodie03"),
            Product("Devslopes Hoodie Black", "$26", "hoodie04")
    )


}