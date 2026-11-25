package com.niitlab.intro



fun main(){
    println("welcome to kotlin")

    val tes = Tesla()
    val cyberTruck = Truck()

    tes.startEngine()
    tes.fuelUp()
    tes.stopEngine()

    cyberTruck.drive()
    cyberTruck.park()
    cyberTruck.insure()
}