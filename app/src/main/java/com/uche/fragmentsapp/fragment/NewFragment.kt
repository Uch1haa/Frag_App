package com.uche.fragmentsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.uche.fragmentsapp.R
import com.uche.fragmentsapp.databinding.FragmentNewBinding


class NewFragment : Fragment() {
    private lateinit var binding: FragmentNewBinding




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewBinding.inflate(inflater, container,false)
       return binding.root
    }

}
