package com.example.storage_recorder.features.productlist.data

import com.example.storage_recorder.Product

interface ProductListDao {
    fun getList() : List<Product>
}