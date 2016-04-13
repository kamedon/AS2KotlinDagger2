package com.example.kamedon.sample20.di

import com.example.kamedon.sample20.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by kamedon on 4/12/16.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(activity: MainActivity)
}
