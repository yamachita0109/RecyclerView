package com.yamachita0109.scroll

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class SampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var textView: TextView = itemView.findViewById<View>(R.id.text) as TextView

}