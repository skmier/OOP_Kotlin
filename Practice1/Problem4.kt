package Practice1

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val a: Int = readln().toInt()
    val b: Double = readln().toDouble()
    val c: Int = readln().toInt()

    val D = b.pow(2.0) - 4 * a * c
    if (D > 0){
        println("Error")
    } else if(D.toInt() == 0){
        val x = (-1 * b) / (2 * a)
        println(x)
    } else{
        val x1 = ((-1 * b + sqrt(D)) / (2 * a))
        val x2 = ((-1 * b - sqrt(D)) / (2 * a))
        println("X1 is $x1 \n X2 is $x2")
    }
}