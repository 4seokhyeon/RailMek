package com.subway.railmek.congestion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.subway.railmek.R
import com.subway.railmek.databinding.FragmentCongestionBinding

class CongestionFragment : Fragment() {

    private var _binding: FragmentCongestionBinding? = null
    private val binding get() =_binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCongestionBinding.inflate(inflater, container, false)
        return binding.root
    }


}