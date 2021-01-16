package com.example.storage_recorder.features.productlist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.storage_recorder.Product
import com.example.storage_recorder.R
import com.squareup.picasso.Picasso
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.positionfragment.view.*

class ProductListAdapter:
        ListAdapter<Product, ProductListAdapter.ViewHolder>(
                object : DiffUtil.ItemCallback<Product>() {
                    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean =
                            oldItem == newItem

                    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean =
                            oldItem == newItem
                }) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(
                    LayoutInflater.from(parent.context)
                            .inflate(R.layout.positionfragment, parent, false)
            )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        setItemView(getItem(position), holder)
    }

    private fun setItemView(product: Product, holder: ViewHolder) {
        if(product.url != null)
            Picasso.get().load(product?.url).into(holder.containerView.pl_pic)
        else Picasso.get().load(holder.containerView.context.getString(R.string.Picture_no_image)).into(holder.containerView.pl_pic)
        holder.containerView.pl_tvData.text = product.name + "\n" + product.type + "\n" + product.count.toString()
    }

    class ViewHolder(override val containerView: View): RecyclerView.ViewHolder(containerView),
            LayoutContainer
}