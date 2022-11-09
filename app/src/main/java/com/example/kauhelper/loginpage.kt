package com.example.kauhelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kauhelper.databinding.FragmentLoginpageBinding

class loginpage : Fragment() {
    var binding: FragmentLoginpageBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginpageBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnLogin?.setOnClickListener {
            if(true) { //TODO : check that input is correct or not. Instead of 'true'
                findNavController().navigate(R.id.action_loginpage_to_timetable)
            }
            else{
                //TODO : make 'warning sign' and clear 'ID, PW INPUT'
            }

        }
        binding?.btnJoin?.setOnClickListener {
            findNavController().navigate(R.id.action_loginpage_to_join)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}