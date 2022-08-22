package com.sigmotoa.workshop

/**
 *
 * Created by sigmotoa on 14/08/22.
 * @author sigmotoa
 *
 * www.sigmotoa.com
 */
class Agility {
    //bigger than

    val num_uno = 5
    val num_dos = 3

    fun main (){
        biggerThan("4","3")

    }



    //Show if the first number is bigger than the second
    fun biggerThan(numA: String, numB: String): Boolean {
        val numBInt = numB.toFloat()
        val numAInt = numA.toFloat()
        if (numBInt < numAInt){
            return true
        }
        return false
    }

    //Sort from bigger the numbers an show in list
    fun order(numA: Int, numB: Int, numC: Int, numD: Int, numE: Int): List<Int?> {
        val myOrderedList = listOf(null)
        return myOrderedList
    }

    //Look for the smaller number of the list
    fun smallerThan(list: List<Double>): Double {
        return 0.0
    }

//Palindrome number is called in Spanish capicúa

    //The number is palindrome
    fun palindromeNumber(numA: Int): Boolean {
        return false
    }

    //the word is palindrome?
    fun palindromeWord(word: String): Boolean {
        return false
    }

    //Show the factorial number for the parameter
    fun factorial(numA: Int): Int {
        return 0
    }

    //is the number odd
    fun is_Odd(numA: Byte): Boolean {
        return false
    }

    //is the number prime
    fun isPrimeNumber(numA: Int): Boolean {
        return false
    }

    //is the number even
    fun is_Even(numA: Byte): Boolean {
        return false
    }

    //is the number perfect
    fun isPerfectNumber(numA: Int): Boolean {
        return false
    }


    //Return an array with the fibonacci sequence for the requested number
    fun fibonacci(numA: Int): List<Int?> {
        val fibonacci = listOf(null)
        return fibonacci
    }


    //how many times the number is divided by 3
    fun timesDividedByThree(numA: Int): Int {
        return 1
    }


    //The game of fizzbuzz
    fun fizzBuzz(numA: Int): String? {

        /**

         * If number is divided by 3, show fizz

         * If number is divided by 5, show buzz

         * If number is divided by 3 and 5, show fizzbuzz

         * in other cases, show the number

         */

        return null

    }

}