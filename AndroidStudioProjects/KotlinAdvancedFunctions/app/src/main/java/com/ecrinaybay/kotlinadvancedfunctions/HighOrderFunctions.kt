package com.ecrinaybay.kotlinadvancedfunctions

fun main(){
    val myNumList = listOf<Int>(1,3,5,7,9,11,13,15)

    //filter fonksiyonu ile filtreleme işlemi yaparız

    /*
    val smallNumberList = myNumList.filter { num -> num < 6 }
    for(num in smallNumberList){
        println(num)
    }
    */


    val smallNumberList = myNumList.filter { it < 6 }
    for(num in smallNumberList){
        println(num)
    }

    //map fonksiyonu ile elimizdeki listeyi istediğimiz gibi şekillendirebiliriz

    /*
    val squaredNumbers = myNumList.map { num -> num * num }
    for(num in squaredNumbers){
        println(num)
    }
    */

    val squaredNumbers = myNumList.map { it*it }
    for(num in squaredNumbers){
        println(num)
    }

    //Önce filter sonra map
    val filterAndMapCombined = myNumList.filter{it<6}.map { it*it}

    val musician = listOf<Musician>(
        Musician("James", 60, "Guitar"),
        Musician("Lars", 55, "Drum"),
        Musician("Kirk", 50, "Guitar")
    )

    val filteredMusicians = musician.filter{musician -> musician.age < 60  }
        .map{musician -> musician.instrument  }

    for (element in filteredMusicians){
        println(element)
    }

}

data class Musician(val name: String, val age:Int, val instrument: String)






































