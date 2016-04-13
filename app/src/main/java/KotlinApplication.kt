package com.example.kamedon.sample20

import android.app.Application
import com.example.kamedon.sample20.di.AppComponent
import com.example.kamedon.sample20.di.AppModule
import com.example.kamedon.sample20.di.DaggerAppComponent

/**
 * Created by kamedon on 4/13/16.
 */
class KotlinApplication : Application() {


    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}
