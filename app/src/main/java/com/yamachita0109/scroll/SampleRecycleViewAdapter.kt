package com.yamachita0109.scroll

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class SampleRecycleViewAdapter(private val list: List<Row>) :
    RecyclerView.Adapter<SampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        val inflate = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return SampleViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        holder.textView.text = list[position].text
    }

    override fun getItemCount(): Int {
        return list.size
    }
}