package com.sigmotoa.workshop

import java.lang.Math.*
import kotlin.math.pow
import kotlin.math.tan

/**
 *
 * Created by sigmotoa on 15/08/22.
 * @author sigmotoa
 *
 * www.sigmotoa.com
 */
class Geometric {

    //Calculate the area for a square using one side
    fun squareArea(side: Int): Int {
        return side * side
    }

    //Calculate the area for a square using two sides
    fun squareArea(sideA: Int, sideB: Int): Int {
        return sideA * sideB
    }

    //Calculate the area of circle with the radius
    fun circleArea(radius: Double): Double {
        return PI* radius.pow(2.0)
    }

    //Calculate the perimeter of circle with the diameter
    fun circlePerimeter(diameter: Int): Double {
        return (PI * diameter).toDouble()
    }

    //Calculate the perimeter of square with a side
    fun squarePerimeter(side: Double): Double {
        return 4 * side
    }

    //Calculate the volume of the sphere with the radius
    fun sphereVolume(radius: Double): Double {
        return 1.33333 * PI * radius.pow(3)
    }

    //Calculate the area of regular pentagon with one side
    fun pentagonArea(side: Int): Float {
        var perimetro = side.toFloat()*5
        var apotema = side /(2*tan(36*PI/180))
        return (perimetro * apotema.toFloat() ) / 2
    }

    //Calculate the Hypotenuse with two legs
    fun calculateHypotenuse(legA: Double, legB: Double): Double = sqrt(legA.pow(2) + legB.pow(2))
}

