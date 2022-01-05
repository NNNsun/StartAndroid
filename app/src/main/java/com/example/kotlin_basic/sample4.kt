package com.example.kotlin_basic

//Singleton Pattern 딱 한번 실행
object CarFactory{
    val cars= mutableListOf<Car>()
    fun makeCar(horsePower: Int):Car{
        val car=Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower:Int)

fun main(){
    val car1=CarFactory.makeCar(10)
    val car2=CarFactory.makeCar(200)

    println(car1)
    println(car2)
    println(CarFactory.cars.toString())

}