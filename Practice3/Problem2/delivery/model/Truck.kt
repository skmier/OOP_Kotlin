package Practice3.Problem2.delivery.model

class Truck(model: String, baseCost: Double, engine: Engine, val maxLoad: Int): Vehicle(model, baseCost , engine ) {
    override fun calculateDeliveryCost(): Double {
        return baseCost + (maxLoad * 2)
    }

    fun calculateDeliveryCost(distance: Double, fuelPrice: Double): Double = baseCost + (maxLoad * 2) +(distance * fuelPrice)

    override fun getVehicleInfo(): String {
        return "Model : $model  Base cost $baseCost $engine  Max Load: $maxLoad"
    }
}