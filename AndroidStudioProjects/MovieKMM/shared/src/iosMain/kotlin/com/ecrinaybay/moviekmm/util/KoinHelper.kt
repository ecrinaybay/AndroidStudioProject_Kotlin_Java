package com.ecrinaybay.moviekmm.util

import com.ecrinaybay.moviekmm.di.getSharedModules
import org.koin.core.context.startKoin

fun initKoin(){
    startKoin {
        modules(getSharedModules())
    }
}





















































