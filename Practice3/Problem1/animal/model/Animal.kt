package Practice3.Problem1.animal.model

open class Animal(
    val name: String,
    val age: Int,
) {
    open fun makeSound(){}

    open fun eat(){
        println("${this.name} is eating")
    }

    open fun eat(food: String){
        println("${this.name} is eating $food")
    }

    open fun getInfo(){
        println("Hi! My name is ${this.name} and I`m ${this.age} y.o")
    }
}