package com.example.storage_recorder

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class  Product(val name:String, val type: String, val count: Int, val url: String?) : Parcelable {
}