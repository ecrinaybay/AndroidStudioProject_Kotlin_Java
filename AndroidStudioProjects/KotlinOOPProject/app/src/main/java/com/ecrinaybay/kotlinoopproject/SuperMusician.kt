package com.ecrinaybay.kotlinoopproject

class SuperMusician(name: String, instrument: String, age: Int) : Musician(name, instrument, age) {

    //Musician sınıfısndan Inheritance aldık. Musician'daki constructor'ı almalıyız

    fun sing(){
        println("nothing else matters")
    }

}