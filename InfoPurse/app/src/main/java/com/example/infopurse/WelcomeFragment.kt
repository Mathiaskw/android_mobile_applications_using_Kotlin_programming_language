package com.example.infopurse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.infopurse.databinding.FragmentWelcomeBinding
import com.example.infopurse.model.SharedViewModel


class WelcomeFragment : Fragment() {
    private val sharedModell: SharedViewModel by activityViewModels()
private var binding: FragmentWelcomeBinding? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            moveNext = this@WelcomeFragment
            viewmodel = sharedModell
            lifecycleOwner = viewLifecycleOwner

        }
    }
    fun gotonextScreen(takeNamethere: String) {
        if (sharedModell.nameINullorEmpty()) {
            sharedModell.getNamesEntered(takeNamethere)
        }
        findNavController().navigate(R.id.action_welcomeFragment_to_displayFragment)
    }
    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}