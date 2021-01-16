package com.example.storage_recorder.features.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.storage_recorder.features.modsearch.ModSearch
import com.example.storage_recorder.features.productlist.ui.ProductList
import com.example.storage_recorder.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClick()
    }

    private fun setOnClick()
    {

        mm_allList.setOnClickListener{
            val intent = Intent(this, ProductList::class.java)
            startActivity(intent)
        }
        mm_modSearch.setOnClickListener{
            val intent = Intent(this, ModSearch::class.java)
            startActivity(intent)
        }
    }
}