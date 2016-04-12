package com.kamedon.kotlindagger2sample.print

import android.util.Log

/**
 * Created by h_kamei on 2016/03/30.
 */
class LogPrint : PrintInterface {
    override fun print(msg: String) {
        Log.d("print", msg);
    }

}
