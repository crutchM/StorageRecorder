package com.example.storage_recorder.features.productlist.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.storage_recorder.Product
import com.example.storage_recorder.R
import com.example.storage_recorder.features.productlist.adapter.ProductListAdapter
import com.example.storage_recorder.features.productlist.presenter.ProductListPresenter
import com.example.storage_recorder.features.productlist.presenter.ProductListView
import kotlinx.android.synthetic.main.activity_product_list.*
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class ProductList : MvpAppCompatActivity(), ProductListView {
    private val presenter : ProductListPresenter by moxyPresenter {
        ProductListPresenter()
    }
    private val _adapter = ProductListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)
        pl_list.adapter = _adapter
        pl_list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    override fun showAllPos(products: List<Product>) {
        _adapter.submitList(products)
    }
}