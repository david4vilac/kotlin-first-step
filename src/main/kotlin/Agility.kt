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
        val myOrderedList = listOf(numA,numB,numC,numD,numE).toMutableList()
        var aux = 0
        for(i in (0  until myOrderedList.size - 1 )){
            for(j in (0  until myOrderedList.size - 1 )){
                if(myOrderedList[j] > myOrderedList[j+1]){
                    aux = myOrderedList[j]
                    myOrderedList[j] = myOrderedList[j+1]
                    myOrderedList[j+1] = aux
                }
            }
        }
        return myOrderedList
    }

    //Look for the smaller number of the list
    fun smallerThan(list: List<Double>): Double {
        var newList = list.toMutableList()
        var aux : Double = newList[0]
        for(i in (0  until newList.size - 1 )){
            if(newList[i] > newList[i+1] && aux > newList[i+1]){
                aux = newList[i+1]
            }
        }
        return aux
    }

//Palindrome number is called in Spanish capicúa

    //The number is palindrome
    fun palindromeNumber(numA: Int): Boolean {
        var cadena : String = ""
        for (num in numA.toString().reversed()){
            cadena += num
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
            cadena += num
        }
        if (cadena == word){
            return true
        }
        return false
    }

    //Show the factorial number for the parameter
    fun factorial(numA: Int): Int {
        var i : Int = numA
        var numFac : Int = 1
        if (numA == 0){
            return 1
        }else{
            while(i != 0){
                numFac *= i
                i--
            }
        }
        return numFac
    }

    //is the number odd
    fun is_Odd(numA: Byte): Boolean {
        if(numA.toInt() % 2 != 0){
            return true
        }
        return false
    }

    //is the number prime
    fun isPrimeNumber(numA: Int): Boolean {
        var aux = numA
        var numMod = 0
        while(aux > 0) {
            if(numA % aux == 0){
                numMod += 1
            }
            aux -= 1
        }
        if (numMod == 2){
            return true
        }
        return false
    }

    //is the number even
    fun is_Even(numA: Byte): Boolean {
        if(numA.toInt() % 2 == 0){
            return true
            }
        return false
        }

    //is the number perfect
    fun isPerfectNumber(numA: Int): Boolean {
        var aux = numA
        var listDividers = mutableListOf<Int>()
        while(aux > 0) {
            if(numA % aux == 0){
                listDividers.add(aux)
            }
            aux -= 1
        }
        listDividers.remove(numA)
        var numB = 0
        listDividers.forEach{it -> numB += it }
        if(numA == numB){
            return true
        }
        return false
    }

    //Return an array with the fibonacci sequence for the requested number
    fun fibonacci(numA: Int): List<Int?> {
        val fibonacci = mutableListOf<Int>(0)
        var num = 0
        var numAfter = 1
        var numBefore: Int = 0
        for(i in (0 until numA)){
            numBefore = numAfter
            numAfter += num
            num = numBefore
            fibonacci.add(num)
        }
        return fibonacci
    }


    //how many times the number is divided by 3
    fun timesDividedByThree(numA: Int): Int {
        return numA/3
    }


    //The game of fizzbuzz
    fun fizzBuzz(numA: Int): String? {
        var result = ""
        if(numA % 3 == 0){
            result += "Fizz"
        }
        if(numA % 5 == 0){
            result += "Buzz"
        } else if (numA % 3 != 0 && numA % 5 != 0){
            result = numA.toString()
        }
        return result

    }

}