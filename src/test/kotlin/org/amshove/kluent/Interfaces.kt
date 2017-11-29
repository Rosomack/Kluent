package org.amshove.kluent


interface Database {
    fun getPerson(): Person
    fun getPerson(id: Int): Person
}

interface Shape {
    fun getArea(): Double
}

