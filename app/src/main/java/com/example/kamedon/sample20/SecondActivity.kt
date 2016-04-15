package com.example.kamedon.sample20

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.kamedon.sample20.print.PrintInterface
import di.ActivityModule
import rand.RandCache
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by kamedon on 4/15/16.
 */
class SecondActivity : AppCompatActivity() {
    @field:[Inject Named("Log")]
    lateinit var log: PrintInterface

    @field:[Inject Named("Toast")]
    lateinit var toast: PrintInterface

    @field:[Inject Named("CacheActivityScope")]
    lateinit var randActivityScope: RandCache

    @field:[Inject Named("CacheActivityScope")]
    lateinit var randActivityScope2: RandCache

    @field:[Inject Named("CacheNotScope")]
    lateinit var randNotScope: RandCache

    @field:[Inject Named("CacheNotScope")]
    lateinit var randNotScope2: RandCache

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        (application as KotlinApplication).appComponent.plus(ActivityModule(this)).inject(this)
        /*
           RandCacheはActivyScopeの設定してる
           Activity間で使いまわせてるかチェック
         */
        Log.d("rand", "rand:NotScope:${randNotScope.rand}:${randNotScope2.rand}:${(randNotScope.equals(randNotScope2))}");
        Log.d("rand", "rand:ActivityScope:${randActivityScope.rand}:${randActivityScope2.rand}:${(randActivityScope.equals(randActivityScope2))}");
        log.print("logからhoge");
        toast.print("toastからhoge");
    }

}
