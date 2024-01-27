package com.ecrinaybay.moviekmm.android

import android.app.Application
import com.ecrinaybay.moviekmm.android.di.appModule
import com.ecrinaybay.moviekmm.di.getSharedModules
import org.koin.core.context.startKoin

class Movie : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }

}




























































