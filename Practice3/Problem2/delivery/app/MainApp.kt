package Practice3.Problem2.delivery.app

import Practice3.Problem2.delivery.model.Car
import Practice3.Problem2.delivery.model.Engine
import Practice3.Problem2.delivery.model.Truck
import Practice3.Problem2.delivery.model.Vehicle
import Practice3.Problem2.delivery.service.DeliveryService

fun main() {
    val c1 = Car("Toyota", 5000.0, Engine("v8", 220.0), 5)
    val t1 = Truck("Volvo", 10000.0, Engine("v12", 500.0), 500)

    val vehicleList = mutableListOf<Vehicle>()
    vehicleList.add(c1)
    vehicleList.add(t1)

    println("Vehicles:")
    val deliveryService: DeliveryService = DeliveryService()
    deliveryService.printAllVehicles(vehicleList)
    println()

    println("All Deliveries")
    deliveryService.calculateAllDeliveries(vehicleList)

    println()
    deliveryService.calculateTotalCost(vehicleList)
}