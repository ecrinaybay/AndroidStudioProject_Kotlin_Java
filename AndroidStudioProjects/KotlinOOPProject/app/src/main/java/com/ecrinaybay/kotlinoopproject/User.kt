package com.ecrinaybay.kotlinoopproject

class User : People {

    //Property
    var name : String? = null
    var age : Int? = null

    //constructor vs init

    constructor(nameInput: String, ageInput:Int){
        this.name = nameInput
        this.age = ageInput
        println("user created")

    }

    init {
        println("init")
    }

}





































