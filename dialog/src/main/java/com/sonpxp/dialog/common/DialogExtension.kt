package com.sonpxp.dialog.common

import android.text.Editable


/**
 * Created by sonpxp on 8/30/2022.
 * Email: sonmob202@gmail.com
 */


fun String.toEditable(): Editable =  Editable.Factory.getInstance().newEditable(this)