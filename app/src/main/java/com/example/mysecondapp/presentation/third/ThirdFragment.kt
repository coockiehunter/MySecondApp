package com.example.mysecondapp.presentation.third

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.RecyclerView
import com.example.mysecondapp.R
import com.example.mysecondapp.createAnimals


class ThirdFragment : Fragment() {

    lateinit var adapter: ThirdAnimalAdapter
    val args: ThirdFragmentArgs by navArgs()

    lateinit var viewModel: ThirdViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(ThirdViewModel::class.java)
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.loadStrData()
        viewModel.isLoadingLd.observe(viewLifecycleOwner) {
            // binding.refresh.isVisible = it
        }
        viewModel.strLd.observe(viewLifecycleOwner) {

            //

        }

        val tv = requireActivity().findViewById<TextView>(R.id.textView)
        tv.text = args.animal.toString()

        tv.setOnClickListener {
            findNavController().popBackStack()
        }

        val rv = requireActivity().findViewById<RecyclerView>(R.id.rv)

        adapter = ThirdAnimalAdapter { animal, position ->
            Toast.makeText(requireContext(), "Clicked element №$position", Toast.LENGTH_SHORT)
                .show()
        }
        adapter.setNewData(createAnimals())

        rv.adapter = adapter

    }


}