package com.example.mysecondapp

abstract class Animal(
    val name: String,
    val desc: String,
    val imgUrl: String,
    private var age: Int
) {

    val v1 = "ghjk"
    val v2: String

    init {
        name
        age

        v2 = "gbhnjmk"
    }

    abstract fun go(seconds: Int): Boolean

    companion object {

        val legCount = 4

        fun getBiologicalClass(): String {
            return "bnmsd"
        }

    }

}

class Dog(
    name: String, desc: String, imgUrl: String, age: Int
) : Animal(name, desc, imgUrl, age), Voicable, Runnable2 {

    override fun go(seconds: Int): Boolean {
        if (seconds > 30) {
            val v1 = false
            return v1
        } else {
            return true
        }
    }

    override fun voice(seconds: Int): Boolean? {
        if (seconds > 30) {
            val v1 = false
            return v1
        } else {
            return true
        }

    }

}

class Cat(name: String, desc: String, imgUrl: String, age: Int) : Animal(name, desc, imgUrl, age),
    Voicable, Runnable2 {

    override fun go(seconds: Int): Boolean {
        if (seconds > 30) {
            val v1 = false
            return v1
        } else {
            return true
        }
    }

    override fun voice(seconds: Int): Boolean? {
        if (seconds > 30) {
            val v1 = false
            return v1
        } else {
            return true
        }

    }

}

object Plate {

    val v1 = "ghjk"
    val v2: String = "rtyuio"

    fun getSomeFood() {

    }

}

interface Voicable {

    fun voice(seconds: Int): Boolean?

}

interface Runnable2

fun createAnimals(): List<Animal> {
    return listOf(
        Dog(
            "Jack",
            "This is Dog. Some text here for Jack's description",
            "https://th-thumbnailer.cdn-si-edu.com/C4MIxDa_YxisZm2EtoTNHweBKZU=/fit-in/1600x0/filters:focal(3126x2084:3127x2085)/https://tf-cmsv2-smithsonianmag-media.s3.amazonaws.com/filer_public/ec/e6/ece69181-708a-496e-b2b7-eaf7078b99e0/gettyimages-1310156391.jpg",
            5
        ),
        Cat(
            "Amy",
            "This is Cat. Some text here for Amy's description",
            "https://media.wired.co.uk/photos/60c8730fa81eb7f50b44037e/16:9/w_2560%2Cc_limit/1521-WIRED-Cat.jpeg",
            4
        ),
        Dog(
            "Rex",
            "This is Dog. Some text here for Rex's description",
            "https://media.allure.com/photos/62b333877389827cf6e080f9/16:9/w_2499,h_1405,c_limit/Is%20it%20ever%20ok%20to%20dye%20your%20dog's%20fur",
            5
        ),
    )
}
