package com.example.chapter4_allminitask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.chapter4_allminitask.databinding.ActivityDialogAndroidBinding

class DialogAndroid : AppCompatActivity() {
    private lateinit var binding: ActivityDialogAndroidBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogAndroidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.DialogStandard.setOnClickListener {
            showDialogStandar()
        }
        binding.DialogTombolAksi.setOnClickListener {
            showDialogNonCancellable()
        }
        binding.DialogCustomLayout.setOnClickListener {
            showDialogCustom()
        }
        binding.DialogFragment.setOnClickListener {
            showFragmentDialog()
        }


    }
    private fun showDialogStandar() {
        val dialog = AlertDialog.Builder(this)
        dialog.setTitle("Dialog Cancellable")
        dialog.setMessage(R.string.message_dialog1)
        dialog.setCancelable(true)
        dialog.show()

    }
    private fun showDialogNonCancellable(){
        val dialog = AlertDialog.Builder(this)
        dialog.setTitle("Dialog Non Cancelable")
        dialog.setMessage(R.string.message_dialog2)
        dialog.setCancelable(false)
        dialog.setPositiveButton("Tutup") { dialogInterface, p1 ->
            dialogInterface.dismiss()
        }
        dialog.setNegativeButton("Pencet ini"){dialogInterface, p1 ->
            Toast.makeText(this,"Ini Toast dari Dialog", Toast.LENGTH_LONG).show()
        }
        dialog.show()
    }

    private fun showDialogCustom(){
        val view = LayoutInflater.from(this).inflate(R.layout.ini_custom_dialog,null,false)
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setView(view)
        val btnTutup = view.findViewById<Button>(R.id.btnTutup)
        val dialog = dialogBuilder.create()

        btnTutup.setOnClickListener {
            Toast.makeText(this,"Custom Dialog Closed",Toast.LENGTH_LONG).show()
            dialog.dismiss()
        }

        dialog.show()
    }
    private fun showFragmentDialog(){
        val dialogFragment = iniDialogFragment(binding.etNama.text.toString())
        dialogFragment.show(supportFragmentManager, null)
    }

}