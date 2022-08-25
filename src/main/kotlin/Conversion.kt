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
        var m : Double
        m = km * 1000
        return m.toInt()
    }

    //Km to meters
    fun kmToM_2(km: Double): Double
    {
        var m_dos : Double
        m_dos = km * 1000
        return m_dos
    }

    //Km to cm
    fun kmToCm(km: Double): Double
    {
        var cm : Double
        cm = km*100000
        return cm
    }

    //millimeters to meters
    fun mmTom(mm: Int): Double
    {
        var m: Double
        m = mm.toDouble() / 1000
        return m
    }

    //convert from units of U.S Standard System

    //convert miles to foot
    fun milesToFoot(miles: Double): Double
    {
        return 0.0
    }

    //convert yards to inches
    fun yardToInch(yard: Int): Int
    {
        return 0
    }

    //convert inches to miles
    fun inchToMiles(inch: Double): Double
    {
        return 0.0
    }

    //convert foot to yards
    fun footToYard(foot: Int): Int
    {
        return 0
    }

    //Convert units between both systems

    //convert Km to inches
    fun kmToInch(km: String?): Double
    {
        return 0.0
    }

    //convert millimeters to feet
    fun mmToFeet(mm: String?): Double
    {
        return 0.0
    }


    //convert yards to cm
    fun yardToCm(yard: String?): Double
    {
        return 0.0
    }

}

