package com.anirban.to_dolist.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anirban.to_dolist.databinding.FragmentAddTasksBinding

class AddTasksScreen : Fragment() {


    private lateinit var binding : FragmentAddTasksBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddTasksBinding.inflate(inflater , container , false)
        return binding.root
    }
}