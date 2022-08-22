package com.sigmotoa.workshop

import org.junit.Assert.*

import org.junit.Test

class GeometricTest {
    private val geometric = Geometric()

    @Test
    fun squareArea1() {
        assertSame(16, geometric.squareArea(side = 4))
    }

    @Test
    fun squareArea2() {
        assertSame(15, geometric.squareArea(sideA = 3, sideB = 5))
    }

    @Test
    fun squareArea3() {
        assertSame(16, geometric.squareArea(4, 4))

    }
    @Test
    fun circleArea1() {
        assertEquals(28.27,
            geometric.circleArea(radius = 0.0),
            0.01
        )
    }

    @Test
    fun circleArea2()
    {
        assertEquals(0.0,
        geometric.circleArea(0.0),
        0.01)
    }


    @Test
    fun circlePerimeter() {
        assertEquals(21.99,
        geometric.circlePerimeter(7),
        0.01)
    }

    @Test
    fun squarePerimeter() {
        assertEquals(81.0,
        geometric.squarePerimeter(9.0),
        0.0)
    }

    @Test
    fun sphereVolume1() {
        assertEquals(14137.16,
            geometric.sphereVolume(15.0),
        1.0)
    }
    @Test
    fun sphereVolume2() {
        assertEquals(4188.79,
            geometric.sphereVolume(10.0),
        1.0)
    }


    @Test
    fun pentagonArea() {
        assertEquals(
            84.30f,
            geometric.pentagonArea(side = 7),
            0.1f
        )
    }

    @Test
    fun calculateHypotenuse() {
        assertEquals(
            5.0,
            geometric.calculateHypotenuse(4.0, 3.0),
            0.0)

        assertEquals(
            5.0,
            geometric.calculateHypotenuse(3.0, 4.0),
            0.0
        )
    }
}