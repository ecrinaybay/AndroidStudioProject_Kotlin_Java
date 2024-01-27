package com.ecrinaybay.classesandfunctions
//primary constructor
class Simpson(var name : String, var age : Int, var job : String) {

    private var height = 0 //Üstteki consturctorda tanımlamadığımızdan nesne oluşturuken bunu vermek opsiyonel olmuş olur

    fun setHeight(num : Int){
        if(num > 100) {
            height = 10
        }
    }

    /*
    //Property
    var name = ""
    var age = 0
    var job = ""
    var weight = 0

    //Secondary constructor
    constructor(name : String, age : Int, job : String, weight : Int){
        this.name = name
        this.age  = age
        this.job = job
        this.weight = weight
    }*/




}

















