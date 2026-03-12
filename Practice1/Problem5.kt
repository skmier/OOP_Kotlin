package Practice1

import java.util.*

fun main() {
    val initialBalance = readln().toDouble()
    val precent = readln().toDouble()
    val interestRate = precent / 100
    val earned = initialBalance * interestRate
    val newBalance = initialBalance + earned
    println("New Balance: $newBalance")
}