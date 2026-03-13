package Practice3.Problem1.animal.app

import Practice3.Problem1.animal.model.Animal
import Practice3.Problem1.animal.model.Dog

fun main() {
    val d1 = Dog("Hachiko", 3, "Akita")
    val d2 =Dog("Lassie", 4,"Rough Collie")

    d1.eat("Meat")
    println()
    d2.eat()

    var listOfDogs = mutableListOf<Animal>()
    listOfDogs.add(d1)
    listOfDogs.add(d2)

    for (d in listOfDogs) {
        d.makeSound()
        d.getInfo()
        println()
    }
}