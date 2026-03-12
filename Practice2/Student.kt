package Practice2

class Student (
    var name: String,
    var ID: String,
    var yearOfStudy: Int
){
    constructor(name: String, ID: String) : this(name,ID,1)

    fun incrementYearOfStudy(){
        yearOfStudy++
    }
}

fun main() {
    val s1 = Student("Meiirzhan","24bd")
    s1.incrementYearOfStudy()
    println(s1.yearOfStudy)
}