package com.example.storage_recorder.features.productlist.presenter

import com.example.storage_recorder.Product
import com.example.storage_recorder.R
import moxy.MvpPresenter

class ProductListPresenter : MvpPresenter<ProductListView>() {
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.showAllPos(mutableListOf(Product("майонез провансаль", "мазик", 228, "https://skidkaonline.ru/img/p/2020/08/205586/10138484-205586-majjonez-makheev-provansal-s-limonnym-sokom-190gr.jpg?t=t1596703265")))
    }
}