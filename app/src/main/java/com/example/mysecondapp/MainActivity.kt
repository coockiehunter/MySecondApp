package com.example.mysecondapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.mysecondapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            textView.setText(getText(R.string.my_text))
            textView.setTextColor(resources.getColor(R.color.purple_200))

            et.hint = "Hint"
            button.isVisible = true

            button.setOnClickListener {
                val text = et.text.toString()
                textView.text = text
            }

            button.setOnLongClickListener {


                true
            }


        }

        val dir = getRandomDirection()

        when (dir) {
            Direction.NORTH -> {
                // fghjk
            }
            Direction.SOUTH -> getRandomDirection()
            else -> {
                // dfghjkl
            }
        }

//        val animal = Dog("Jack", 5)
//        animal
        Animal.legCount
        Animal.getBiologicalClass()

        Plate.getSomeFood()

    }

    fun myInnerFun(str: String): String {
        return "Some string"
    }
}