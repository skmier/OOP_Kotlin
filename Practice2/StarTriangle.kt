package Practice2

class StarTriangle(
    val width: Int
) {
    override fun toString(): String {
        var star:String = ""
        for (i in 0..width){
            for (j in 0 .. i){
                star += "[*]"
            }
            star += "\n"
        }

        return star
    }
}

fun main() {
    val test = StarTriangle(4)
    println(test)
}