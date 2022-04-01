package com.example.chapter4_allminitask.RecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter4_allminitask.R
import com.example.chapter4_allminitask.databinding.ActivityRecyclerViewMainBinding

class RecyclerViewMain : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerViewMainBinding
    private lateinit var adapter: MainAdapter
    private lateinit var adapterDiff: AdapterDiff

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var listData = arrayListOf(
            DataRecyclerView(0, "Arnold nyenye", R.drawable.arnold_nyenyenye),
            DataRecyclerView(1, "AwakwardKid", R.drawable.awakward),
        )
        binding.RecyclerViewData.isNestedScrollingEnabled = false

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.RecyclerViewData.layoutManager = layoutManager
        val adapterDiff = AdapterDiff(listData)

//
//        binding.btnNoDiff.setOnClickListener {
//            adapter = MainAdapter()
//            adapter.setData(listData)
//            binding.RecyclerViewData.adapter = adapter
//        }
//
//        binding.btnUpdate.setOnClickListener {
//            listData[0] = DataRecyclerView(0, "Why r u Gehhh", R.drawable.geh)
//            adapter.setData(listData)
//            adapter.notifyDataSetChanged()
//        }

        binding.btnDiff.setOnClickListener {
            binding.RecyclerViewData.adapter = adapterDiff
            adapterDiff.submitData(listData)
        }
        binding.btnUpdateDiff.setOnClickListener {
            val list: MutableList<DataRecyclerView> = listData.toMutableList()
            list[0] = DataRecyclerView(0,"Why r u Gehhh", R.drawable.geh)
            adapterDiff.differ.submitList(list)
        }


    }
}