package com.example.kotlin_basic

fun main(){
    /*checkNum(1)
    forAndWhile()*/
    //nullcheck()
    //igoreNulls(email)

}

fun maxBy(a : Int, b : Int):Int{
    if(a>b){
        return a
    }else{
        return b
    }
}
fun maxBy2(a:Int, b:Int):Int=if(a>b) a else b

fun checkNum(score:Int):Unit{
    when(score){
        0->println("this is 0")
        1->println("this is 1")
        2,3->println("this is 2 or 3")
    }
    var b:Int = when(score){
        1->1
        2->2
        else ->3
    }
    println("b:${b}")
    when (score){
        in 90..100->println("You are genius")
        in 10..80->println("Not bad")
        else ->println("okay")
    }
}
// Expression ex return vs Statement ex(when)

//Array and list

//Array

//List 1. List 2. MutableList

fun array(){
    val array= arrayOf(1,2,3)
    val list=listOf(1,2,3)

    val array2=arrayOf(1,2,3)
    val list2= listOf (1,"d",11L)

    array[0]=3
    var result :Int = list.get(0)
    val arrayList=arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0]=20

}

fun forAndWhile(){
    val students =arrayListOf("joyce","james","janiper")

    for(name:String in students){
        println("${name}")
    }
    for ((index :Int, name: String) in students.withIndex()){
        println("${index+1}번째 학생: ${name}")
    }
    var sum:Int=0
    for (i:Int in 1..100){
        sum+=i
    }
    println(sum)
    var index=0
    while (index <10){
        println("current index: ${index}")
        index++
    }
}
// Nullable / NonNull

fun nullcheck(){
    //NPE : NUll pointer Exception
    var name ="joyce"

    var nullName:String? =null

    var nameUnUpperCase:String = name.toUpperCase()

    var nullNameInUpperCase : String?=nullName?.toUpperCase()

    //?:

    val lastName : String?="Hong"
    val fullName:String = name+" "+(lastName?: "No lastName")
    println(fullName)
    //!!
}

fun igoreNulls(str:String?){
    val mNotNull : String =str!!
    val upper:String = mNotNull.toUpperCase()


    val email : String?="joycehongXXXX@nana.vom"
    email?.let{
        println("my email is ${email}")
    }

}











