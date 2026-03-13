package Practice3.Problem2.delivery.service

import Practice3.Problem2.delivery.model.Vehicle

class DeliveryService {
    fun printAllVehicles(vehicles: List<Vehicle>){
        for (v in vehicles ){
            println(v.getVehicleInfo())
        }
    }

    fun calculateAllDeliveries(vehicles: List<Vehicle>){
        for (v in vehicles ){
            println(v.calculateDeliveryCost())
        }
    }

    fun calculateTotalCost(vehicles: List<Vehicle>){
        var total: Double = 0.0
        for (v in vehicles ){
            total += v.calculateDeliveryCost()
        }

        println("Total cost: $total")
    }
}