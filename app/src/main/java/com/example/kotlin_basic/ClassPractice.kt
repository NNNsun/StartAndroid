package com.example.kotlin_basic

open class Human(val name:String="Anonymous"){
    constructor(name:String, age: Int):this(name){
        println("my name is ${name}, ${age}years old")
    }
    init{
        println("New human has been born!!")
    }

    fun eatingCake(){
        println("This is so YUMMMMY~~~")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human(){
    override fun singASong(){
        super.singASong()
        println("라라라ㅏ")
        println("my name is :${name}")
    }
}



fun main(){
    val korean =Korean()
    korean.singASong()
}