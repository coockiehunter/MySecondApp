package com.example.mysecondapp.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.RecyclerView
import com.example.mysecondapp.R
import com.example.mysecondapp.createAnimals

class SecondFragment : Fragment() {

    val args: SecondFragmentArgs by navArgs()
    lateinit var adapter: SecondAnimalAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tv = view.findViewById<TextView>(R.id.textView)
        val rv = view.findViewById<RecyclerView>(R.id.rv)
        tv.text = args.mysrt

        adapter = SecondAnimalAdapter { animal, position ->
            Toast.makeText(requireContext(), "Clicked element №$position", Toast.LENGTH_SHORT)
                .show()
            findNavController().navigate(SecondFragmentDirections.secondToThird())
        }
        adapter.setNewData(createAnimals())
        rv.adapter = adapter

    }

}