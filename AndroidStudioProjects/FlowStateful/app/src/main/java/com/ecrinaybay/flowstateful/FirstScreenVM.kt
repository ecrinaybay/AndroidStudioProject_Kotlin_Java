package com.ecrinaybay.flowstateful

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn

class FirstScreenVM : ViewModel(){

    val mycounter = MutableStateFlow(0)

    private var count = 0

    val counter = flow{
        while (true){
            delay(1000L)
            println("running flow")
            emit(count++)
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000),0)



}



















































