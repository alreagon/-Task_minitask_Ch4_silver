package com.example.chapter4_allminitask.SharedPreferencesLat

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chapter4_allminitask.R
import com.example.chapter4_allminitask.databinding.ActivitySharedPreferencesBinding
import com.example.chapter4_allminitask.databinding.ActivitySharedPreferencesLatBinding

class SharedPreferencesLat : AppCompatActivity() {
    private lateinit var binding: ActivitySharedPreferencesLatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySharedPreferencesLatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences =
            getSharedPreferences(
                getString(R.string.shared_pref_file_lat),
                Context.MODE_PRIVATE
            )

        binding.btnloginshared.setOnClickListener {
//            if (binding.etemailshared.text.toString().isNullOrEmpty() &&
//                binding.etpasswordshare.text.toString().isNullOrEmpty()
//            ) {
//                Toast.makeText(this, "Isi dulu bang yg lengkap", Toast.LENGTH_LONG).show()
//            } else {
                val editor: SharedPreferences.Editor = sharedPreferences.edit()
                editor.putString(KEY_EMAIL, binding.etemailshared.text.toString())
                editor.putString(KEY_PASS, binding.etpasswordshare.text.toString())
                editor.apply()

                val email = binding.etemailshared.text.toString()
                val pass = binding.etpasswordshare.text.toString()
                val user = DataSharedPreLat(email, pass)
                val intent = Intent(this, HomePageLat::class.java)
                intent.putExtra("user", user)
                startActivity(intent)

//            }
        }

    }

    companion object {
        val KEY_EMAIL = "email_key"
        val KEY_PASS = "pass_key"
    }
}