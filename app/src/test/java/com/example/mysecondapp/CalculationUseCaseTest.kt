package com.example.mysecondapp

import com.example.mysecondapp.domain.CalculationUseCase
import org.junit.Assert.assertEquals
import org.junit.Test

class CalculationUseCaseTest {

    @Test
    fun calculateSum_Test() {
        assertEquals(5.0, CalculationUseCase.calculateSum(2.0, 3.0), 0.0)
    }


}