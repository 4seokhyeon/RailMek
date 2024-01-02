package com.subway.railmek.myroot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.subway.railmek.R
import com.subway.railmek.databinding.FragmentMyRootBinding


class MyRootFragment : Fragment() {
    private var _binding: FragmentMyRootBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMyRootBinding.inflate(inflater,container,false)
        return binding.root
    }


}