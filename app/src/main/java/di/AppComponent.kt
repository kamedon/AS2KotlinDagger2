package com.example.kamedon.sample20.di

import dagger.Component
import di.ActivityComponent
import di.ActivityModule
import javax.inject.Singleton

/**
 * Created by kamedon on 4/12/16.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun plus(activityModule: ActivityModule): ActivityComponent
}
