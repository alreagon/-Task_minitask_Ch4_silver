package com.example.chapter4_allminitask

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.chapter4_allminitask.RecyclerView.RecyclerViewMain
import com.example.chapter4_allminitask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.topic1.setOnClickListener {
            val Intent = Intent(this, ToastSnackbar::class.java)
            startActivity(Intent)
        }
        binding.topic1.setOnLongClickListener {
            Toast.makeText(this, "Toast & Snackbar", Toast.LENGTH_LONG).show()
            true
        }
        binding.topic2.setOnClickListener {
            val Intent = Intent(this, DialogAndroid::class.java)
            startActivity(Intent)
        }
        binding.topic2.setOnLongClickListener {
            Toast.makeText(this, "Dialog di Android", Toast.LENGTH_LONG).show()
            true
        }
        binding.topic3.setOnClickListener {
            val Intent = Intent(this, RecyclerViewMain::class.java)
            startActivity(Intent)
        }
        binding.topic3.setOnLongClickListener {
            var dialog = DialogFragmentTopic4()
            dialog.show(supportFragmentManager, null)
            true
        }

    }
}