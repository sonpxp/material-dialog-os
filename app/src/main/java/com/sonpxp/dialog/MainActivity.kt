package com.sonpxp.dialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AlertMaterialHelper.showYesNoAlert(
            this,
            "hello",
            "kiki",
            onAgreeCallback = onAgreeCallback,
            onCancelCallback = onCancelCallback
        )
    }

    private val onAgreeCallback: () -> Unit = {

    }

    private val onCancelCallback: () -> Unit = {
    }
}