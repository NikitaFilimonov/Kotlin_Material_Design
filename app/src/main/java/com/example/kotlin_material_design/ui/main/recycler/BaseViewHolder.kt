package com.example.kotlin_material_design.ui.main.recycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bind(dataItem: Pair<Data, Boolean>)
}
