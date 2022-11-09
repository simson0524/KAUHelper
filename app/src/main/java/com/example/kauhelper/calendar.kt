package com.example.kauhelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kauhelper.databinding.FragmentCalendarBinding


class calendar : Fragment() {
    var binding: FragmentCalendarBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCalendarBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btn30?.setOnClickListener {
            findNavController().navigate(R.id.action_calendar_to_timetable)
        }
        binding?.btn31?.setOnClickListener {
            findNavController().navigate(R.id.action_calendar_to_transportation)
        }
        binding?.btn32?.setOnClickListener {
            findNavController().navigate(R.id.action_calendar_to_map)
        }
        binding?.btn34?.setOnClickListener {
            findNavController().navigate(R.id.action_calendar_to_menu)
        }
        binding?.btn35?.setOnClickListener {
            findNavController().navigate(R.id.action_calendar_to_mypage)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    } // To protect memory
}