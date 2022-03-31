package com.example.chapter4_allminitask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chapter4_allminitask.databinding.ActivityToastSnackbarBinding
import com.google.android.material.snackbar.Snackbar

class ToastSnackbar : AppCompatActivity() {
    private lateinit var binding: ActivityToastSnackbarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToastSnackbarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Toast.setOnLongClickListener {

            Toast.makeText(this, "Selamat Datang ${binding.etNama.text}", Toast.LENGTH_LONG).show()
            true
        }
        binding.Snackbar.setOnLongClickListener {
            Snackbar.make(it, "Selamat Datang ${binding.etNama.text}", Snackbar.LENGTH_LONG)
                .setAction("Text Action") {
                    Toast.makeText(this, "Toast dari Snackbar ya ${binding.etNama.text}", Toast.LENGTH_LONG).show()
                }
                .setAction("set"){
                    Toast.makeText(this, "Toast dari Snackbar ya 2 ${binding.etNama.text}", Toast.LENGTH_LONG).show()
                }
                .show()
            true
        }


    }
}