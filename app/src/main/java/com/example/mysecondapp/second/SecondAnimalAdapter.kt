package com.example.mysecondapp.second

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mysecondapp.Animal
import com.example.mysecondapp.R
import com.example.mysecondapp.databinding.ItemAnimalBinding

class SecondAnimalAdapter(
    val onClick: (model: Animal, position: Int) -> Unit
) : RecyclerView.Adapter<SecondAnimalAdapter.AnimalViewHolder>() {

    private val list = ArrayList<Animal>()

    inner class AnimalViewHolder(val binding: ItemAnimalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItem(animal: Animal, position: Int) {
            binding.tvName.text = animal.name
            binding.tvDesc.text = animal.desc
            binding.btn.setOnClickListener {
                onClick(animal, position)
            }

            Glide.with(binding.iv.context)
                .load("https://i.imgur.com/AxETlhd.jpg")
                .centerInside()
                .placeholder(R.drawable.cat)
                .into(binding.iv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimalViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bindItem(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setNewData(newList: List<Animal>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

}