package Practice3.Problem2.delivery.model

class Engine(
    val type:String,
    val horsePower: Double
) {

    fun getEngineInfo(){
        println("Engine type: ${this.type} Horse Power: ${this.horsePower}")
    }

    override fun toString(): String {
        return "Engine type: $type Horse Power: $horsePower"
    }
}