package com.example.kotlin_basic

data class Ticket(val commpanyName : String, val name : String, var date: String, var seatNumber : Int)
//toString(),sashCode(),equals(),copy() data class에 존재
class TicketNormal(val commpanyName : String, val name : String, var date: String, var seatNumber : Int)

fun main(){
    val ticketA= Ticket("koreanAir", "joyHong", "2020-02-16", 14)
    val ticketB= TicketNormal("koreanAir", "joyHong", "2020-02-16", 14)
    println(ticketA)
    println(ticketB)//주소값
}