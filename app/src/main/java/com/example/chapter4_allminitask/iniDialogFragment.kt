package com.example.chapter4_allminitask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.chapter4_allminitask.databinding.FragmentIniDialogBinding

class iniDialogFragment() : DialogFragment() {
    private var _binding: FragmentIniDialogBinding? = null
    private val binding get() = _binding!!
    private lateinit var name: String

    constructor(name: String) : this() {
        this.name = name
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        dialog?.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        if (this.name.isNullOrEmpty()) {
            binding.tvHello.text = name
        }

        binding.btnTutup.setOnClickListener {
            Toast.makeText(requireContext(), "Ini dari Dialog Fragment", Toast.LENGTH_LONG).show()
            dialog?.dismiss()
            true
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}