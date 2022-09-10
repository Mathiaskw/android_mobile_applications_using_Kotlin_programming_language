package com.example.infopurse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.infopurse.databinding.FragmentDisplayBinding
import com.example.infopurse.model.SharedViewModel

class DisplayFragment : Fragment() {
    private val sharedModell: SharedViewModel by activityViewModels()
private var binding: FragmentDisplayBinding? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDisplayBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            viewmodel = sharedModell
            lifecycleOwner = viewLifecycleOwner
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}