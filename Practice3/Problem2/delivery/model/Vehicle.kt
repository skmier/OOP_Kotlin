package Practice3.Problem2.delivery.model

abstract class Vehicle(
    val model: String,
    val baseCost: Double,
    val engine: Engine
) {
    abstract fun calculateDeliveryCost(): Double

    abstract fun getVehicleInfo(): String
}