package com.kamedon.kotlindagger2sample.print

import android.content.Context
import android.widget.Toast

/**
 * Created by h_kamei on 2016/03/30.
 */
class ToastPrint(var context: Context) : PrintInterface {

    override fun print(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

}
