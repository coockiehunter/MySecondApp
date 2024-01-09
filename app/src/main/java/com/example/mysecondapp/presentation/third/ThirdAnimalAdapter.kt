package com.example.mysecondapp.presentation.third

//import com.bumptech.glide.Glide
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mysecondapp.Animal
import com.example.mysecondapp.R
import com.example.mysecondapp.databinding.ItemAnimalBinding

class ThirdAnimalAdapter(
    val onClick: (model: Animal, position: Int) -> Unit
) : ListAdapter<Animal, ThirdAnimalAdapter.AnimalViewHolder>(DiffCallback()) {

    private val list = ArrayList<Animal>()

    inner class AnimalViewHolder(val binding: ItemAnimalBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindView(animal: Animal, position: Int) {
            binding.tvName.text = animal.name
            binding.tvDesc.text = animal.desc
            binding.btn.setOnClickListener {
                onClick(animal, position)
            }

            Glide.with(binding.iv.context)
                .load(R.drawable.cat)
//                .centerInside()
                .into(binding.iv)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimalViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val animal = list[position]
        holder.bindView(animal, position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setNewData(newList: List<Animal>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }

    internal class DiffCallback : DiffUtil.ItemCallback<Animal>() {
        override fun areItemsTheSame(oldItem: Animal, newItem: Animal): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Animal, newItem: Animal): Boolean {
            return (oldItem.name == newItem.name) &&
                    (oldItem.desc == newItem.desc)
        }

    }

}