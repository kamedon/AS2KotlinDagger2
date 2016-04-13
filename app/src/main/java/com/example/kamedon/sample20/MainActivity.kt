package com.example.kamedon.sample20

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.kamedon.sample20.print.PrintInterface
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @field:[Inject Named("Log")]
    lateinit var log: PrintInterface

    @field:[Inject Named("Toast")]
    lateinit var toast: PrintInterface


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as KotlinApplication).appComponent.inject(this)
        //
        log.print("logからhoge");
        toast.print("toastからhoge");
    }
}
