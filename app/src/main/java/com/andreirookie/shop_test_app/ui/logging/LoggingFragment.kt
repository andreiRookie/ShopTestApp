package com.andreirookie.shop_test_app.ui.logging

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.andreirookie.shop_test_app.R
import com.andreirookie.shop_test_app.databinding.FragmentLoggingBinding

class LoggingFragment : Fragment() {

    private var _binding: FragmentLoggingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoggingBinding.inflate(inflater, container, false)

        binding.loggingButton.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_logging_to_navigation_catalog)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}