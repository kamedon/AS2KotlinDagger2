package di

/**
 * Created by kamedon on 4/14/16.
 */

import android.app.Activity
import android.content.Context
import com.example.kamedon.sample20.print.LogPrint
import com.example.kamedon.sample20.print.PrintInterface
import com.example.kamedon.sample20.print.ToastPrint
import javax.inject.Singleton

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ActivityModule(val activity: Activity) {

    @Provides
    @Singleton
    fun provideActivity(): Activity {
        return activity
    }

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
