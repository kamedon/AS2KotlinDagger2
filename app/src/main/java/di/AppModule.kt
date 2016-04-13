package com.example.kamedon.sample20.di

import android.app.Application
import android.content.Context
import com.example.kamedon.sample20.print.LogPrint
import com.example.kamedon.sample20.print.PrintInterface
import com.example.kamedon.sample20.print.ToastPrint
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by h_kamei on 2016/03/30.
 */
@Module
class AppModule(val application: Application) {

    @Provides
    @Singleton
    fun provideApplicationContext() = application.applicationContext

    @Named("Toast")
    @Provides
    @Singleton
    fun provideToast(context: Context): PrintInterface {
        return ToastPrint(context);
    }

    @Named("Log")
    @Provides
    @Singleton
    fun provideLog(): PrintInterface {
        return LogPrint();
    }

}
