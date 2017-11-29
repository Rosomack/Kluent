package org.amshove.kluent
import org.amshove.kluent.Shape
import kotlin.math.PI

data class Person(val name: String, val surname: String)

class Circle(val radius: Double) : Shape {
    override fun getArea() = radius * PI * PI
}

class Square(val side: Double) : Shape {
    override fun getArea() = side * side
}
