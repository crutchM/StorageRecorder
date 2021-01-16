package com.example.storage_recorder.DB

import android.content.Context
import com.example.storage_recorder.Product

class DBController(context: Context) {
    private val _dbHelper : DbHelper = DbHelper(context, "product")

    fun getAllPos() : List<Product>{
        var cursor = _dbHelper.readableDatabase.rawQuery("SELECT * FROM product", null)
        var e = mutableListOf<Product>()
        while(cursor.moveToNext())
            e.add(Product(cursor.getString(cursor.getColumnIndex("name")),
                    cursor.getString(cursor.getColumnIndex("type")),
                    cursor.getInt(cursor.getColumnIndex("count")),
                    cursor.getString(cursor.getColumnIndex("url"))
            ))
        return e
    }

    fun getOneTypeProducts(type: String){

    }

    fun addPos(product: Product){

    }

    fun deletePos(product: Product){

    }
}