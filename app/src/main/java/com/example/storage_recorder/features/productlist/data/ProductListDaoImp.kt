package com.example.storage_recorder.features.productlist.data

import com.example.storage_recorder.DB.DBController
import com.example.storage_recorder.Product

class ProductListDaoImp(private val _db : DBController) : ProductListDao {
    override fun getList() :List<Product> {
        return _db.getAllPos()
    }
}