package com.example.mysecondapp.presentation.second

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
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.mysecondapp.R

class SecondFragment : Fragment() {

    val args: SecondFragmentArgs by navArgs()
    lateinit var adapter: SecondAnimalAdapter

    lateinit var viewModel: SecondViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(SecondViewModel::class.java)
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tv = view.findViewById<TextView>(R.id.textView)
        val rv = view.findViewById<RecyclerView>(R.id.rv)
        val swipe = view.findViewById<SwipeRefreshLayout>(R.id.swipe)
        tv.text = args.mysrt

        adapter = SecondAnimalAdapter { animal, position ->
            Toast.makeText(requireContext(), "Clicked element №$position", Toast.LENGTH_SHORT)
                .show()
            findNavController().navigate(SecondFragmentDirections.secondToThird())
        }

        swipe.setOnRefreshListener {
            viewModel.getAnimalList()
        }
        viewModel.animalListLd.observe(viewLifecycleOwner) {
            adapter.setNewData(it)
        }
        viewModel.isLoading.observe(viewLifecycleOwner) {
//            swipe.isRefreshing = it
            if (!it)
                swipe.isRefreshing = false
        }
        rv.adapter = adapter

    }

}