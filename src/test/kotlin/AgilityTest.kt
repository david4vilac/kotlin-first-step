package com.sigmotoa.workshop

import org.hamcrest.CoreMatchers. `is`
import org.junit.Assert.*
import org.junit.Test


class AgilityTest {

    private val agile = Agility()

    @Test
    fun whenBiggerThan() {
        assertTrue(
            "Error in your code",
            agile.biggerThan(
                "100",
                "10"
            )
        )
        assertTrue(
            "Error in your code",
            agile.biggerThan(
                "0.05"
                ,"0.005"
            )
        )
        assertFalse(
            "Error in your code",
            agile.biggerThan(
                "10"
                ,"100"
            )
        )
        assertFalse(
            "Error in your code",
            agile.biggerThan(
                "0.01"
                ,"0.02"
            )
        )
    }

    @Test
    fun whenOrder() {
        assertEquals(
            "Wrong order",
            listOf(2,4,8,10,15),
            agile.order(10,15,2,4,8)
        )
       assertEquals(
           "Wrong order",
           listOf(-10,2,4,8,15),
           agile.order(-10, 15, 2, 4, 8)
       )
        assertEquals(
            "Wrong order",
            listOf(-7,-4,0,10,15),
            agile.order(0,15,-7,-4, 10)
        )
    }

    @Test
    fun smallerThan() {
        assertEquals(
            "Error",
            -1.0,
            agile.smallerThan(
                listOf(0.0, 10.1, -1.0, -0.2, 3.2, 200.1 )
            ),
            0.0
        )
        assertEquals(
            "Error",
            10.0,
            agile.smallerThan(
                listOf(10.0, 10.1, 20.0, 30.2)
            ),
            0.0
        )
        assertEquals(
            "Error",
            -100.1,
            agile.smallerThan(
                listOf(3.0, 45.12, 78.0, 0.0, 10.1, -1.0, -0.2, 3.2, -100.1)
            ),
            0.0
        )
        assertEquals(
            "Error",
            -12.0,
            agile.smallerThan(
                listOf(0.0, 10.1, -1.0, -0.2, 3.2, 200.1, -12.0)
            ),
            0.0
        )

    }

    @Test
    fun palindromeNumber() {
        assertTrue("Wrong answer",
            agile.palindromeNumber(123321)
        )
        assertTrue("Wrong answer",
            agile.palindromeNumber(1234321)
        )
        assertTrue("Wrong answer",
            agile.palindromeNumber(1237321)
        )
        assertFalse("Wrong answer",
            agile.palindromeNumber(123)
        )
        assertFalse("Wrong answer",
            agile.palindromeNumber(345)
        )
    }

    @Test
    fun palindromeWord() {
        assertTrue(
            "Wrong answer",
            agile.palindromeWord("civic")
            )
        assertTrue(
            "Wrong answer",
            agile.palindromeWord("solos")
        )
        assertTrue(
            "Wrong answer",
            agile.palindromeWord("rotator")
        )
        assertFalse(
            "Wrong answer",
            agile.palindromeWord("sigmotoa")
        )

    }

    @Test
    fun factorial() {

        assertEquals("Error",
        1,
        agile.factorial(0))

        assertEquals("Error",
        1,
        agile.factorial(1))

        assertEquals("Error",
        6,
        agile.factorial(3))

        assertEquals("Error",
        3628800,
        agile.factorial(10))
    }

    @Test
    fun is_Odd() {

        assertTrue(
            "Wrong answer",
        agile.is_Odd(numA = -7)
        )
        assertFalse(
            "Number isn't odd",
            agile.is_Odd(-2)
        )
        assertFalse(
            "Number isn't odd",
            agile.is_Odd(numA = 80)
        )
        assertFalse(
            "Number isn't odd",
        agile.is_Odd(2)
        )
        assertTrue(
            "Wrong answer",
            agile.is_Odd(numA = 125)
        )


    }

    @Test
    fun isPrimeNumber() {
        assertFalse(
            "Wrong answer",
            agile.isPrimeNumber(6)
        )
        assertFalse(
            "Wrong answer",
            agile.isPrimeNumber(10)
        )
        assertFalse(
            "Wrong answer",
            agile.isPrimeNumber(-1)
        )
        assertTrue(
            "Wrong answer",
            agile.isPrimeNumber(2)
        )
        assertTrue(
            "Wrong answer",
            agile.isPrimeNumber(7)
        )
        assertTrue(
            "Wrong answer",
            agile.isPrimeNumber(97)
        )
    }

    @Test
    fun is_Even() {
        assertTrue(
            "Wrong answer",
            agile.is_Even(-8)
        )
        assertTrue(
            "Wrong answer",
            agile.is_Even(124)
        )
        assertTrue(
            "Wrong answer",
            agile.is_Even(14)
        )
        assertFalse(
            "Wrong answer",
            agile.is_Even(-7)
        )
        assertFalse(
            "Wrong answer",
            agile.is_Even(81)
        )
    }

    @Test
    fun isPerfectNumber() {
        assertTrue(
            "Wrong answer",
            agile.isPerfectNumber(6)
        )
        assertTrue(
            "Wrong answer",
            agile.isPerfectNumber(496)
        )
        assertFalse(
            "Wrong answer",
            agile.isPerfectNumber(100)
        )
        assertFalse(
            "Wrong answer",
            agile.isPerfectNumber(57)
        )
    }

    @Test
    fun fibonacci() {
        assertEquals(
            "Wrong answer",
            listOf(0,1,1,2,3,5,8,13,21,34,55),
            agile.fibonacci(10)
        )
        assertEquals(
            "Wrong answer",
            listOf(0,1,1,2,3,5,8,13,21),
            agile.fibonacci(8)
        )
        assertEquals(
            "Wrong answer",
            listOf(0,1,1),
            agile.fibonacci(2)
        )
        assertEquals(
            "Wrong answer",
            listOf(0,1,1,2,3,5,8,13,21,34,55,89),
            agile.fibonacci(11)
        )


    }

    @Test
    fun timesDividedByThree() {
        assertEquals(
            "Wrong answer",
            1,
            agile.timesDividedByThree(3)
        )
        assertEquals(
            "Wrong answer",
            1,
            agile.timesDividedByThree(4)
        )
        assertEquals(
            "Wrong answer",
            1,
            agile.timesDividedByThree(5)
        )
        assertEquals(
            "Wrong answer",
            2,
            agile.timesDividedByThree(6)
        )
        assertEquals(
            "Wrong answer",
            2,
            agile.timesDividedByThree(7)
        )
        assertNotEquals(
            "Wrong answer",
            3,
            agile.timesDividedByThree(3)
        )
    }

    @Test
    fun fizzBuzz() {
        assertThat(agile.fizzBuzz(6), `is`("Fizz"))
        assertThat(agile.fizzBuzz(3), `is`("Fizz"))
        assertThat(agile.fizzBuzz(5), `is`("Buzz"))
        assertThat(agile.fizzBuzz(10), `is`("Buzz"))
        assertThat(agile.fizzBuzz(15), `is`("FizzBuzz"))
        assertThat(agile.fizzBuzz(30), `is`("FizzBuzz"))
        assertThat(agile.fizzBuzz(2), `is`("2"))
        assertThat(agile.fizzBuzz(16), `is`("16"))
        assertThat(agile.fizzBuzz(4), `is`("4"))
    }
}