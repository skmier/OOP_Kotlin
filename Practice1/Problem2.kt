package Practice1

import kotlin.math.sqrt

fun main() {
    val a: Int = readln().toInt()

    println("Area: ${area(a)}")
    println("Perimeter: ${perimetr(a)}")
    println("Length of diagonal : ${lengthOfDiagonal(a)}")
}

fun area(a: Int): Int{
    return a * a
}

fun perimetr(a: Int): Int{
    return (a + a) * 2
}

fun lengthOfDiagonal(a: Int): Double{
    return a * sqrt(2.0)
}