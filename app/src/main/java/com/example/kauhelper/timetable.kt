package com.example.kauhelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kauhelper.databinding.FragmentTimetableBinding

class timetable : Fragment() {
    var binding: FragmentTimetableBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTimetableBinding.inflate(inflater)
        return binding?.root
    }

    //TODO : Create 'timetable'

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btn1Transportation?.setOnClickListener {
            findNavController().navigate(R.id.action_timetable_to_transportation)
        }
        binding?.btn2Map?.setOnClickListener {
            findNavController().navigate(R.id.action_timetable_to_map)
        }
        binding?.btn3Calendar?.setOnClickListener {
            findNavController().navigate(R.id.action_timetable_to_calendar)
        }
        binding?.btn4Menu?.setOnClickListener {
            findNavController().navigate(R.id.action_timetable_to_menu)
        }
        binding?.btn5Mypage?.setOnClickListener {
            findNavController().navigate(R.id.action_timetable_to_mypage)
        }
    }
}