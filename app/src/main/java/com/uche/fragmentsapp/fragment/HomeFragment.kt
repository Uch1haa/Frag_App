package com.uche.fragmentsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.uche.fragmentsapp.R
import com.uche.fragmentsapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var manager: FragmentManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        manager = requireActivity().supportFragmentManager
        binding.apply {
            nextButton.setOnClickListener {
                openNextFragmentKt()


            }
        }
        return binding.root
    }

    //kotlin method to move to another fragment
    private fun openNextFragmentKt() {
        manager.commit {
            replace<NewFragment>(R.id.fragmentContainerView)
            setReorderingAllowed(true)
            addToBackStack("")
        }
    }

    //java method to move to move another fragment
    private fun openNextFragmentJv() {
        manager.beginTransaction()
            .replace(R.id.fragmentContainerView, NewFragment::class.java, null)
            .setReorderingAllowed(true)
            .addToBackStack("")


    }


}