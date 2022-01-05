package com.example.kotlin_basic

//1. Lamda
//람다식은 우리가 마치 value처럼 다룰 수 있는 익명 함수이다.
//1) 메소드의 파라미터로 넘겨줄수있다. fun maxBy(a:Int)
//2) reuturn 값으로 사용할 수가 있다.

//람다의 기본 정의
//val lamdaName : Type = {argumentList -> code Body}

val square={number:Int->number*number}

val nameAge= {name:String,age: Int ->
    "my name is ${name} I'm ${age}"
}

fun main(){
    println(square(12))
    println(nameAge("joy",99))
    val a = "joyce said"
    val b = "mac said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())
    println(extendString("ariana",28))

    println(calculateGrade(97))
    println(calculateGrade(1000))

    val lamda={number:Double->
        number==4.32324
    }
    println(invokeLamda(lamda))
    println(invokeLamda({it>3.22}))

    println(invokeLamda { it>3.22 })




}

//확장함수
val pizzaIsGreat:String.()-> String={
    this + "Pizza is the best!!"
}

fun extendString(name: String,age:Int): String{
    val introduceMyself : String.(Int)->String={"I am ${this} and ${it} years old"}
    return name.introduceMyself(28)
}
//람다의 Return
val calculateGrade: (Int)->String = {
    when(it){
        in 0..40->"fail"
        in 21..70->"pass"
        in 71..100->"pefect"
        else ->"Error"
    }
}
//람다를 표현하는 여러가지 방법
fun invokeLamda(lamda:(Double)->Boolean):Boolean{
    return lamda(5.323)
}

//pojo class(모델이 되는 클래스 like abstruct in Java



