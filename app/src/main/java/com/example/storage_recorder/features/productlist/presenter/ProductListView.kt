package com.example.storage_recorder.features.productlist.presenter

import com.example.storage_recorder.Product
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

interface ProductListView : MvpView{
    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showAllPos(products: List<Product>)
}