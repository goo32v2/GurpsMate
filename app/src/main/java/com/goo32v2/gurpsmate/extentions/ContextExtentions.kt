package com.goo32v2.gurpsmate.extentions

import android.content.Context
import android.widget.Toast

/**
 * @author Alexander Steblin (goo32v2)
 * @date 11.11.2017
 */

fun Context.toast(text: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}