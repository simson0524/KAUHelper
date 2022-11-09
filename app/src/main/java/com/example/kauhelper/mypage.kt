package com.example.kauhelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kauhelper.databinding.FragmentMypageBinding


class mypage : Fragment() {
    var binding: FragmentMypageBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMypageBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btn50?.setOnClickListener {
            findNavController().navigate(R.id.action_mypage_to_timetable)
        }
        binding?.btn51?.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_transportation)
        }
        binding?.btn52?.setOnClickListener {
            findNavController().navigate(R.id.action_mypage_to_map)
        }
        binding?.btn53?.setOnClickListener {
            findNavController().navigate(R.id.action_mypage_to_calendar)
        }
        binding?.btn54?.setOnClickListener {
            findNavController().navigate(R.id.action_mypage_to_menu)
        }


        binding?.btnAdmin?.setOnClickListener {
            findNavController().navigate(R.id.action_mypage_to_admin)
        }
        binding?.btnSettings?.setOnClickListener {
            findNavController().navigate(R.id.action_mypage_to_settings)
        }
        binding?.btnLogout?.setOnClickListener {
            findNavController().navigate(R.id.action_mypage_to_loginpage)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    } // To protect memory
}