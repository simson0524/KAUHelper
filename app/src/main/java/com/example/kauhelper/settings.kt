package com.example.kauhelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kauhelper.databinding.FragmentSettingsBinding


class settings : Fragment() {
    var binding: FragmentSettingsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingsBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnConfirm2?.setOnClickListener {
            //TODO : store input info at server
            findNavController().navigate(R.id.action_settings_to_mypage2)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    } // To protect memory
}