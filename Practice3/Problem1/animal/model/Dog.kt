package Practice3.Problem1.animal.model

class Dog(name: String, age: Int, val breed: String) : Animal(name, age) {
    override fun makeSound() {
        println("Woof woof")
    }

    override fun getInfo() {
        super.getInfo()
        print(" Breed is: $breed ")
    }
}