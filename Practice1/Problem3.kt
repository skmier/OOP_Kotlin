package Practice1

fun main() {
    val myGrade = readln().toInt()
    if (myGrade >= 95 && myGrade <= 100) {
        println("A")
    } else if (myGrade >= 90 && myGrade < 95) {
        println("A-")
    } else if (myGrade >= 85 && myGrade < 90) {
        println("B+")
    } else if (myGrade >= 80 && myGrade < 85) {
        println("B")
    } else if (myGrade >= 75 && myGrade < 80) {
        println("B-")
    } else if (myGrade >= 70 && myGrade < 75) {
        println("C+")
    } else if (myGrade >= 65 && myGrade < 70) {
        println("C")
    } else if (myGrade >= 60 && myGrade < 65) {
        println("C-")
    } else if (myGrade >= 55 && myGrade < 60) {
        println("D+")
    } else if (myGrade >= 50 && myGrade < 55) {
        println("D")
    } else if (myGrade >= 0 && myGrade < 50) {
        println("F")
    } else {
        println("Another grade")
    }
}