package di

/**
 * Created by kamedon on 4/14/16.
 */

import android.app.Activity
import android.content.Context
import android.util.Log
import com.example.kamedon.sample20.print.LogPrint
import com.example.kamedon.sample20.print.PrintInterface
import com.example.kamedon.sample20.print.ToastPrint
import javax.inject.Singleton

import dagger.Component
import dagger.Module
import dagger.Provides
import rand.RandCache
import javax.inject.Named

@Module
class ActivityModule(val activity: Activity) {

    @Provides
    @ActivityScope
    fun provideActivity(): Activity = activity

    @Named("Toast")
    @Provides
    @ActivityScope
    fun provideToast(context: Context, @Named("CacheActivityScope") randCache: RandCache): PrintInterface {
        /*
           RandCacheはActivityScopeの設定してる
           Activity間で使いまわせてるかチェック
         */
        Log.d("rand", "toast:${randCache.rand}");
        return ToastPrint(context)
    }

    @Named("Log")
    @Provides
    @ActivityScope
    fun provideLog(@Named("CacheActivityScope") randCache: RandCache): PrintInterface {
        /*
           RandCacheはActivityScopeの設定してる
           Activity間で使いまわせてるかチェック
         */
        Log.d("rand", "log:${randCache.rand}");
        return LogPrint()
    }

    @Named("CacheActivityScope")
    @Provides
    @ActivityScope
    fun provideRandCacheScope(): RandCache = RandCache()

    @Named("CacheNotScope")
    @Provides
    fun provideRandCacheNotScope(): RandCache = RandCache()
}
