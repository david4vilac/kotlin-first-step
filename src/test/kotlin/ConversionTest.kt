package com.sigmotoa.workshop

import org.junit.Assert.*

import org.junit.Test

class ConversionTest {

    private val conversion = Conversion()
    @Test
    fun kmToM_1() {
        assertEquals(
            "Error in your conversion",
            178,
            conversion.kmToM_1(0.178))
    }

    @Test
    fun kmToM_2() {
        assertEquals(
            "Error in your conversion",
            12452.0,
            conversion.kmToM_2(12.452),
            0.0)
    }

    @Test
    fun kmToCm() {
        assertEquals(
            "Error in your conversion",
            7630.0,
            conversion.kmToCm(0.07630),
            0.000000000001
        )
        assertEquals(
            "Error in your conversion",
            5907000.0,
            conversion.kmToCm(59.07),
            0.000000000001
        )
    }

    @Test
    fun mmTom() {
        assertEquals(
            "Error in your conversion",
            3141.516,
            conversion.mmTom(3141516),
            0.1
        )
    }

    @Test
    fun milesToFoot() {
        assertEquals(
            "Errors in your conversion",
            469920.0,
            conversion.milesToFoot(89.0),
            0.0
        )
    }

    @Test
    fun yardToInch() {
        assertEquals(
            "Error in your conversion",
            3204,
            conversion.yardToInch(89)
        )
    }

    @Test
    fun inchToMiles() {
        assertEquals(
            "Error in your conversion",
            0.0014678030303030302,
            conversion.inchToMiles(93.0),
            0.0001
        )

        assertEquals("Error in your conversion",
            1.4046717171717172E-5,
            conversion.inchToMiles(0.89),
            0.0001
        )
    }

    @Test
    fun footToYard() {
        assertEquals(
            "Error in your conversion",
            316,
            conversion.footToYard(950))
    }

    @Test
    fun kmToInch() {
        assertEquals(
            "Error in your conversion",
            3748425.2,
            conversion.kmToInch("95.21"),
            0.1
        )
    }

    @Test
    fun mmToFeet() {
        assertEquals(
            "Error in your conversion",
            0.3123687,
            conversion.mmToFeet("95.21"),
            0.1
        )
    }

    @Test
    fun yardToCm() {
        assertEquals(
            "Error in your conversion",
            8706.0024,
            conversion.yardToCm("95.21"),
            0.1
        )
    }

    /*@Test
    fun errors()
    {
        assertEquals("Error",
            true,
            conversion.kmToInch("Km")
        )
        assertEquals(
            "Error",
            true,
            conversion.mmToFeet("mm")
        )
        assertEquals(
            "Error",
            true,
            conversion.yardToCm("yard")
        )
    }*/
}