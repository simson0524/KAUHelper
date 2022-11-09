package com.example.kauhelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kauhelper.databinding.FragmentMapBinding


class map : Fragment() {
    var binding: FragmentMapBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMapBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btn20?.setOnClickListener {
            findNavController().navigate(R.id.action_map_to_timetable)
        }
        binding?.btn21?.setOnClickListener {
            findNavController().navigate(R.id.action_map_to_transportation)
        }
        binding?.btn23?.setOnClickListener {
            findNavController().navigate(R.id.action_map_to_calendar)
        }
        binding?.btn24?.setOnClickListener {
            findNavController().navigate(R.id.action_map_to_menu)
        }
        binding?.btn25?.setOnClickListener {
            findNavController().navigate(R.id.action_map_to_mypage)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    } // To protect memory
}