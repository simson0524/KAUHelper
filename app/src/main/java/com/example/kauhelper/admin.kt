package com.example.kauhelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kauhelper.databinding.FragmentAdminBinding


class admin : Fragment() {
    var binding: FragmentAdminBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAdminBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnConfirm1?.setOnClickListener {
            findNavController().navigate(R.id.action_admin_to_mypage)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    } // To protect memory
}