package com.ecrinaybay.koincryptocrazy.di

import com.ecrinaybay.koincryptocrazy.view.ListFragment
import com.ecrinaybay.koincryptocrazy.view.MainActivity
import org.koin.core.qualifier.named
import org.koin.dsl.module

val anotherModule = module {

    scope<ListFragment> {
        scoped(qualifier = named("hello")) {
            "Hello Kotlin"
        }
        scoped(qualifier = named("hi")) {
            "Hi Kotlin"
        }
    }


}




















































