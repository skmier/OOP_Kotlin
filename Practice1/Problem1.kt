package Practice1

fun main() {
    val myName: String = readln()
    printMyName(myName)
}


fun printMyName(myName: String){
    for (i in 0 until 3){
        if(i == 0 || i ==2){
            if (i == 2) {
                println()
            }
            for (j in 0..myName.length + 1){
                if (j == 0 || j == myName.length + 1){
                    print("+")
                }else{
                    print("-")
                }
            }
        } else{
            println()
            print("|$myName|")
        }
    }
}