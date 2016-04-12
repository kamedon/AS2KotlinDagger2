package com.kamedon.kotlindagger2sample.di

import android.app.Application
import android.content.Context
import com.kamedon.kotlindagger2sample.print.PrintInterface
import com.kamedon.kotlindagger2sample.print.ToastPrint
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by h_kamei on 2016/03/30.
 */
@Module
class AppModule(val application: Application) {

    @Provides
    @Singleton
    fun provideApplicationContext() = application.applicationContext

    @Provides
    @Singleton
    fun providePrint(context: Context): PrintInterface {
        return ToastPrint(context);
    }

}
