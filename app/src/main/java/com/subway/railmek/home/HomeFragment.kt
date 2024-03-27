package com.subway.railmek.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.subway.railme.viewmodel.SubWayInfoViewModel
import com.subway.railme.viewmodel.SubWayInfoViewModelFactory
import com.subway.railmek.R
import com.subway.railmek.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding:FragmentHomeBinding?=null
    private val binding get() = _binding!!
    private val viewModel by lazy {
        ViewModelProvider(this, SubWayInfoViewModelFactory())[SubWayInfoViewModel::class.java]
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.searchBT.setOnClickListener {
            val word = binding.searchStation.text.toString()
            viewModel.setSubwayInfo(word)
        }
    }
}