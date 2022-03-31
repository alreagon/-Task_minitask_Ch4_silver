package com.example.chapter4_allminitask.RecyclerViewFox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4_allminitask.R

class MainRecyclerViewFox : AppCompatActivity() {

    private lateinit var newRecyclerview : RecyclerView
    private lateinit var newArrayList: ArrayList<News_fox>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recycler_view_fox)
        imageId = arrayOf(
            R.drawable.arnold_nyenyenye,
            R.drawable.awakward,
            R.drawable.arnold_nyenyenye,
            R.drawable.awakward,
            R.drawable.arnold_nyenyenye,
            R.drawable.awakward,
            R.drawable.arnold_nyenyenye,
            R.drawable.awakward,
            R.drawable.arnold_nyenyenye,
            R.drawable.awakward,
            R.drawable.arnold_nyenyenye,
            R.drawable.awakward,
            R.drawable.arnold_nyenyenye,
            R.drawable.awakward,
            R.drawable.arnold_nyenyenye,
            R.drawable.awakward,
        )
        heading = arrayOf(
            "Arnold lagi nyenyen yeny  yur iughui  hrghuerg \neny\n ney\n neyey enyene ney neyn",
            "awakrd kid :(",
            "Arnold lagi nyenyen yeny  yur iughui  hrghuerg \neny\n ney\n neyey enyene ney neyn",
            "awakrd kid :(",
            "Arnold lagi nyenyen yeny  yur iughui  hrghuerg \neny\n ney\n neyey enyene ney neyn",
            "awakrd kid :(",
            "Arnold lagi nyenyen yeny  yur iughui  hrghuerg \neny\n ney\n neyey enyene ney neyn",
            "awakrd kid :(",
            "Arnold lagi nyenyen yeny  yur iughui  hrghuerg \neny\n ney\n neyey enyene ney neyn",
            "awakrd kid :(",
            "Arnold lagi nyenyen yeny  yur iughui  hrghuerg \neny\n ney\n neyey enyene ney neyn",
            "awakrd kid :(",
            "Arnold lagi nyenyen yeny  yur iughui  hrghuerg \neny\n ney\n neyey enyene ney neyn",
            "awakrd kid :(",
            "Arnold lagi nyenyen yeny  yur iughui  hrghuerg \neny\n ney\n neyey enyene ney neyn",
            "awakrd kid :(",

        )

        newRecyclerview = findViewById(R.id.rvFox)
        newRecyclerview.layoutManager = LinearLayoutManager(this)
        newRecyclerview.setHasFixedSize(true)

        newArrayList = arrayListOf<News_fox>()
        getUserData()


    }

    private fun getUserData() {
        for (i in imageId.indices){

            val news = News_fox(imageId[i], heading[i])
            newArrayList.add(news)
        }
        newRecyclerview.adapter = MyAdapter_fox(newArrayList)
    }
}