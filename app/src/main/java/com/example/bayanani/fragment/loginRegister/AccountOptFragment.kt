package com.example.bayanani.fragment.loginRegister

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bayanani.R
import com.example.bayanani.databinding.FragmentAccountoptionsBinding

class AccountOptFragment: Fragment(R.layout.fragment_accountoptions) {
    private lateinit var binding: FragmentAccountoptionsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAccountoptionsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnTologin.setOnClickListener {
            findNavController().navigate(R.id.action_accountOptFragment_to_loginFragment)
        }

        binding.btnToregister.setOnClickListener {
            findNavController().navigate(R.id.action_accountOptFragment_to_registerFragment)
        }
    }
}