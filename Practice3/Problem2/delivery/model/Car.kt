package Practice3.Problem2.delivery.model

class Car(
    model: String,
    baseCost: Double,
    engine: Engine,
    val numberOfSeats: Int,
    ): Vehicle(model, baseCost, engine,) {


    override fun calculateDeliveryCost(): Double = baseCost +( numberOfSeats * 60 )

    fun calculateDeliveryCost(extraWeight: Double): Double = baseCost + ( numberOfSeats * 60) + ( extraWeight * 4)

    override fun getVehicleInfo(): String {
        return "Model : $model  Base cost $baseCost $engine Number Of seats : $numberOfSeats"
    }

}