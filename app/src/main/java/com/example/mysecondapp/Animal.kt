package com.example.mysecondapp

abstract class Animal(val name: String, private var age: Int) {

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

class Dog(name: String, age: Int) : Animal(name, age), Voicable, Runnable2 {

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

class Rose() : Voicable {
    override fun voice(seconds: Int): Boolean? {
        return null
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

interface Flyable

interface Runnable2

open class Plant() {}