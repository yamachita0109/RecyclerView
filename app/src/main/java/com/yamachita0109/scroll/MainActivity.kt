package com.yamachita0109.scroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.recyclerView)
        rv.run {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = SampleRecycleViewAdapter(this@MainActivity.set())
        }
    }

    private fun set(): List<Row> {
        val list = mutableListOf<Row>()
        for (i in 0..1000) {
            list.add(Row("index: $i"))
        }
        return list
    }
}