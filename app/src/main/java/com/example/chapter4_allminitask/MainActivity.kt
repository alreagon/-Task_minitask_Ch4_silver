package com.example.chapter4_allminitask

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.chapter4_allminitask.RecyclerView.RecyclerViewMain
import com.example.chapter4_allminitask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.orenMantep)
        }


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
            Toast.makeText(this, "RecyclerView", Toast.LENGTH_LONG).show()
            true
        }
        binding.topic4.setOnClickListener {
            var dialog = DialogFragmentTopic4()
            dialog.show(supportFragmentManager, null)
        }
        binding.topic4.setOnLongClickListener {
            Toast.makeText(this, "Shared Preferences", Toast.LENGTH_LONG).show()
            true
        }

    }
}