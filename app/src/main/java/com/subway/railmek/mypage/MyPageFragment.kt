package com.subway.railmek.mypage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.subway.railmek.R
import com.subway.railmek.databinding.FragmentMyPageBinding


class MyPageFragment : Fragment() {
    private var _binding:FragmentMyPageBinding?= null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMyPageBinding.inflate(inflater, container,false)
        return binding.root
    }


}