package com.anirban.to_dolist.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anirban.to_dolist.R
import com.anirban.to_dolist.databinding.FragmentCategoryScreenBinding

class CategoryScreen : Fragment() {

    private lateinit var binding : FragmentCategoryScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCategoryScreenBinding.inflate(inflater , container , false)
        return binding.root
    }
}