package com.ecrinaybay.kotlinoopproject

open class Musician(name: String, instrument: String, age: Int) {
    //open ile başka yerlerden bu sınıfa ulaşılmasını sağladık

    //encapsulation

    var name : String? = name
        private set
        get

    private var instrument : String? = instrument

    var age : Int? = age
        private set
        get

    private val bandName : String = "Metallica"

    fun returnBandName(password : String) : String{
        if(password == "Atil"){
            return bandName
        }else{
            return "Wrong password!"
        }
    }

}























































