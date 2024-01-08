package com.example.mysecondapp.presentation.second

//import com.bumptech.glide.Glide
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mysecondapp.databinding.ItemAnimalBinding
import com.example.mysecondapp.domain.animal.model.Animal

class SecondAnimalAdapter(
    val onClick: (model: Animal, position: Int) -> Unit
) : RecyclerView.Adapter<SecondAnimalAdapter.AnimalViewHolder>() {

    private val list = ArrayList<Animal>()

    inner class AnimalViewHolder(val binding: ItemAnimalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItem(animal: Animal, position: Int) {
            binding.tvName.text = animal.name
            binding.tvDesc.text = animal.decs
            binding.btn.setOnClickListener {
                onClick(animal, position)
            }

//            val url = "https://pepiainpcvlatamappst.blob.core.windows.net/iai-cv-latamapp-planograms/LATAM%2F528%2F6%20TRAMOS%205N%20TIENDA%20528%2Frack_1.jpg?sv=2021-10-04&st=2023-03-21T19%3A09%3A32Z&se=2023-03-21T19%3A19%3A32Z&sr=b&sp=r&sig=M0%2BjaYuSABWpwt4JmJ2NAxhWYFFGStTnrAFJcV%2Bd9kM%3D"
//            Glide.with(binding.iv.context)
//                .load("https://i.imgur.com/AxETlhd.jpg")
//                .centerInside()
//                .placeholder(R.drawable.cat)
//                .into(binding.iv)
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