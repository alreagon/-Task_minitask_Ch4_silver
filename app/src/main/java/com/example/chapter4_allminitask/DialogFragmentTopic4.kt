package com.example.chapter4_allminitask

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.chapter4_allminitask.databinding.FragmentDialogTopic4Binding

class DialogFragmentTopic4(): DialogFragment() {


    private var _binding: FragmentDialogTopic4Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDialogTopic4Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        dialog?.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dialog?.setCancelable(false)
        binding.btnkeluar.setOnClickListener {
            Toast.makeText(activity,"yah gk jadi",Toast.LENGTH_LONG).show()
            dialog?.dismiss()
        }

        binding.btnkenyoba.setOnClickListener {
            val intent = Intent(this.requireContext(), SharedPreferences::class.java)
            startActivity(intent)
        }
        binding.btnkelatihan.setOnClickListener {
            val intent = Intent(this.requireContext(), SplashScreen::class.java)
            startActivity(intent)
        }

    }


}