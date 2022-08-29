package com.sigmotoa.workshop

/**
 *
 * Created by sigmotoa on 14/08/22.
 * @author sigmotoa
 *
 * www.sigmotoa.com
 */
class Conversion {
    // Convert many measure units

    //km to meters
    fun kmToM_1(km: Double): Int
    {
        val m : Double = km * 1000
        return m.toInt()
    }

    //Km to meters
    fun kmToM_2(km: Double): Double
    {
        return km * 1000
    }

    //Km to cm
    fun kmToCm(km: Double): Double
    {
        return km * 100000
    }

    //millimeters to meters
    fun mmTom(mm: Int): Double
    {
        return mm.toDouble() / 1000
    }

    //convert from units of U.S Standard System

    //convert miles to foot
    fun milesToFoot(miles: Double): Double
    {
        return miles * 5280
    }

    //convert yards to inches
    fun yardToInch(yard: Int): Int
    {
        return yard * 36
    }

    //convert inches to miles
    fun inchToMiles(inch: Double): Double
    {
        return inch / 63360
    }

    //convert foot to yards
    fun footToYard(foot: Int): Int
    {
        return foot / 3
    }

    //Convert units between both systems

    //convert Km to inches
    fun kmToInch(km: String?): Double
    {
        return km!!.toDouble() * 39370.078
    }

    //convert millimeters to feet
    fun mmToFeet(mm: String?): Double
    {
        return mm!!.toDouble() / 304.8
    }


    //convert yards to cm
    fun yardToCm(yard: String?): Double
    {
        try {
           val double = yard!!.toDouble() * 91.44
            return double
        } finally {
            return "true"
        }
    //return yard!!.toDouble() * 91.44
    }

}

