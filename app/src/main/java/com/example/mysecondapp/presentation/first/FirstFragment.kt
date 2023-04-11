package com.example.mysecondapp.presentation.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.mysecondapp.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding

    lateinit var viewModel: FirstViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        viewModel = ViewModelProvider(this).get(FirstViewModel::class.java)
        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToSecond.setOnClickListener {
            findNavController().navigate(
                FirstFragmentDirections.firstToSecond(
                    "Some string from first fragment"
                )
            )
        }
        binding.buttonToThird.setOnClickListener {
            findNavController().navigate(FirstFragmentDirections.firstToThird())
        }

        viewModel.isLoading.observe(viewLifecycleOwner) {

            //

        }

    }


}