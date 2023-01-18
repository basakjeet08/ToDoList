package com.anirban.to_dolist.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anirban.to_dolist.R
import com.anirban.to_dolist.databinding.FragmentTimerScreenBinding

class TimerScreen : Fragment() {


    private lateinit var  binding : FragmentTimerScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentTimerScreenBinding.inflate(inflater , container , false)
        // Inflate the layout for this fragment
        return binding.root
    }
}