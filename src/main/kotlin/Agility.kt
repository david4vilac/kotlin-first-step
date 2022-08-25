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
        val myOrderedList = listOf(numA, numB, numC, numD, numE)

       /* var myOrderedList = listOf(7, 8, 3, 7, 9)
        var mutableList: MutableList<Int> = mutableListOf()
        for (numero in myOrderedList){
            print(numero)
            var aux: Int = myOrderedList[0]
            if(numero < aux){
                aux = numero
            }else{
                mutableList.add(aux)
                aux =  myOrderedList[0]
            }
        }
        print(mutableList)*/

        return myOrderedList
    }

    //Look for the smaller number of the list
    fun smallerThan(list: List<Double>): Double {
        return 0.0
    }

//Palindrome number is called in Spanish capicúa

    //The number is palindrome
    fun palindromeNumber(numA: Int): Boolean {
        var cadena : String = ""
        for (num in numA.toString().reversed()){
            cadena = cadena + num
        }
        if (cadena == numA.toString()){
            return true
        }
        return false
    }

    //the word is palindrome?
    fun palindromeWord(word: String): Boolean {
        var cadena : String = ""
        for (num in word.reversed()){
            cadena = cadena + num
        }
        if (cadena == word){
            return true
        }
        return false
    }

    //Show the factorial number for the parameter
    fun factorial(numA: Int): Int {
        var i : Int = numA
        var num_fac : Int = 1
        print(numA)
        if (numA == 0){
            return 1
        }else{
            while(i != 0){
                num_fac = num_fac * i
                i--
            }
        }
        return num_fac
    }

    //is the number odd
    fun is_Odd(numA: Byte): Boolean {
        return false
    }

    //is the number prime
    fun isPrimeNumber(numA: Int): Boolean {
        if(numA.toInt() % 2 == 0){
            return true
        }
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