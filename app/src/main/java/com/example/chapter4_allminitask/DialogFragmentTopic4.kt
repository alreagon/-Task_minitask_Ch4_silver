package com.example.chapter4_allminitask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.chapter4_allminitask.databinding.FragmentDialogTopic4Binding
import com.example.chapter4_allminitask.databinding.FragmentIniDialogBinding

class DialogFragmentTopic4: DialogFragment() {

    private var _binding: FragmentDialogTopic4Binding? = null
    private val binding get() = _binding!!
    private lateinit var name: String


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

        binding.btnkeluar.setOnClickListener {
            dismiss()
        }

    }


}