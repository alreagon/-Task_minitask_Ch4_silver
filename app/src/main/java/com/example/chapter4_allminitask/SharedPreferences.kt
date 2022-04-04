package com.example.chapter4_allminitask

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chapter4_allminitask.databinding.ActivitySharedPreferencesBinding

class SharedPreferences : AppCompatActivity() {
    private lateinit var binding : ActivitySharedPreferencesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySharedPreferencesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences =
            getSharedPreferences(
                getString(R.string.shared_pref_file),
                Context.MODE_PRIVATE
            )

        binding.btnSave.setOnClickListener {
            if(binding.etInputId.text.toString().isNullOrEmpty()&&
                    binding.etInputName.text.toString().isNullOrEmpty()){
                Toast.makeText(this,"Isi dulu bang yg lengkap", Toast.LENGTH_LONG).show()
            } else{
                val editor : SharedPreferences.Editor = sharedPreferences.edit()
                editor.putInt(KEY_ID, Integer.parseInt(binding.etInputId.text.toString()))
                editor.putString(KEY_NAME, binding.etInputName.text.toString())
                editor.apply()
                Toast.makeText(this,"Data tersimpan", Toast.LENGTH_LONG).show()
            }
        }

        binding.btnView.setOnClickListener {
            val sharedId = sharedPreferences.getInt(KEY_ID,0)
            val sharedName = sharedPreferences.getString(KEY_NAME, "NAMANYA MANA?")

            binding.tvShowId.text = sharedId.toString()
            binding.tvShowName.text = sharedName

            if (sharedId == 0 && sharedName.equals("NAMANYA MANA?")){
                Toast.makeText(this, "Datanya kosong", Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this, "Datanya telah di tampilkan", Toast.LENGTH_LONG).show()
            }
        }
        binding.btnClear.setOnClickListener {
            val editor = sharedPreferences.edit()
            editor.clear()
            editor.apply()
            binding.tvShowName.text = ""
            binding.tvShowId.text = ""
            Toast.makeText(this,"Data CLEAR!", Toast.LENGTH_LONG).show()
        }

    }

    companion object {
        val KEY_ID = "id_key"
        val KEY_NAME = "name_key"
    }
}