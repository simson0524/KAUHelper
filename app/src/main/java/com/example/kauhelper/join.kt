package com.example.kauhelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kauhelper.databinding.FragmentJoinBinding


class join : Fragment() {
    var binding: FragmentJoinBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentJoinBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnConfirm?.setOnClickListener {
            //TODO : store input info at server if input is new
            findNavController().navigate(R.id.action_join_to_settings)
        }
        binding?.btnBack?.setOnClickListener {
            findNavController().navigate(R.id.action_join_to_loginpage)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    } // To protect memory
}