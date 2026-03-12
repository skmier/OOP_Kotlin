package Practice1

fun main() {
    val word = readln()
    println(isPalindrome(word))
}

fun isPalindrome(word : String) : Boolean{
    return word == word.reversed()
}