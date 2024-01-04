package com.example.mysecondapp.presentation

class MyFirstClass() {

    var v1: String? = "jkl;"
    private val v2 = "dfghjk"
    protected val v3 = "FGHJKL"

    fun sum(x1: Double, x2: Double = 0.0, x3: Double = 0.0): Double {
        val v4 = x1 + x2 + x3

        v1?.let {
            v1
        }




        return v4
    }

    fun sum(x1: Int, x2: Int): Int {
        return x1 + x2
    }

    fun myOuterFun(number: Int, innerFun: (myString: String) -> Unit): Int {
        innerFun("Some string")
        return number * number
    }

}


interface MyFirstInterface {

    fun sum(x1: Double, x2: Double = 0.0, x3: Double = 0.0): Double

}