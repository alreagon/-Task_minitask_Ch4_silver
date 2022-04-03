package com.example.chapter4_allminitask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.chapter4_allminitask.databinding.FragmentDialogTopic4Binding
import com.example.chapter4_allminitask.databinding.FragmentIniDialogBinding

class iniDialogFragment() : DialogFragment() {


    private var _binding: FragmentIniDialogBinding? = null
    private val binding get() = _binding!!
    private lateinit var name: String


    //Secondary Constructor untuk menangani jika DialogFragment membutuhkan data custom
    constructor(name: String):this(){
        this.name = name
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentIniDialogBinding.inflate(inflater, container, false)
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

        if(!this.name.isNullOrEmpty()){
            binding.tvHelloFragment.text = name

        }

        binding.btnTutupFragment.setOnClickListener {
            Toast.makeText(activity,"DialogFragment Ditutup dari dalam fragment",Toast.LENGTH_LONG).show()
            dialog?.dismiss()
        }
    }
}