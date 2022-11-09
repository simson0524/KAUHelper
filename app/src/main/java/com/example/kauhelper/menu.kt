package com.example.kauhelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kauhelper.databinding.FragmentMenuBinding


class menu : Fragment() {
    var binding: FragmentMenuBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btn40?.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_timetable)
        }
        binding?.btn41?.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_transportation)
        }
        binding?.btn42?.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_map)
        }
        binding?.btn43?.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_calendar)
        }
        binding?.btn45?.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_mypage)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    } // To protect memory
}