package com.example.chapter4_allminitask.SharedPreferencesLat

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chapter4_allminitask.R
import com.example.chapter4_allminitask.SharedPreferences
import com.example.chapter4_allminitask.databinding.ActivityHomePageLatBinding

class HomePageLat : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageLatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageLatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences =
            getSharedPreferences(
                getString(R.string.shared_pref_file_lat),
                Context.MODE_PRIVATE
            )

//        val user: DataSharedPreLat = intent.getParcelableExtra("user")!!
//
//        binding.tvemailsharelat.text = "Ini email kamu :\n${user.email}"


        val shareEmaillat = sharedPreferences.getString(SharedPreferencesLat.KEY_EMAIL, "NAMANYA MANA?")

        binding.tvemailsharelat.text = shareEmaillat

        if (shareEmaillat.equals("NAMANYA MANA?")){
            Toast.makeText(this, "Datanya kosong", Toast.LENGTH_LONG).show()
        } else{
            Toast.makeText(this, "Datanya telah di tampilkan", Toast.LENGTH_LONG).show()
        }
    }
}