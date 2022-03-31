package com.example.chapter4_allminitask.RecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter4_allminitask.R
import com.example.chapter4_allminitask.databinding.ActivityRecyclerViewMainBinding

class RecyclerViewMain : AppCompatActivity() {
    private lateinit var binding : ActivityRecyclerViewMainBinding
//    private lateinit var adapter: MainAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        var listData = arrayListOf(
//
//        )

    }
}