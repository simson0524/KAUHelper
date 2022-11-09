package com.example.kauhelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kauhelper.databinding.FragmentTransportationBinding


class transportation : Fragment() {

    private var metro11Destination: String? = null
    private var metro12Destination: String? = null
    private var metro21Destination: String? = null
    private var metro22Destination: String? = null

    private var metro11Info: String? = null
    private var metro12Info: String? = null
    private var metro21Info: String? = null
    private var metro22Info: String? = null  //metro sheet info

    private var bus11Info: String? = null
    private var bus12Info: String? = null  //bus1 sheet info

    private var bus21Info: String? = null
    private var bus22Info: String? = null //bus2 sheet info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
           metro11Destination = it.getString("Destination")
           metro12Destination = it.getString("Destination")
           metro21Destination = it.getString("Destination")
           metro22Destination = it.getString("Destination")

            //TODO
        }
    }

    var binding: FragmentTransportationBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTransportationBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // binding?.txt~~~

        binding?.btn1Transportation?.setOnClickListener {
            findNavController().navigate(R.id.action_transportationFragment_to)
        }
    }
}