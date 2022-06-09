package com.example.android.minipaint

import android.app.StatusBarManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.STATUS_BAR_HIDDEN
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.view.WindowInsets

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myCanvasView = MyCanvasView(this)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            myCanvasView.windowInsetsController?.hide(WindowInsets.Type.statusBars())
        }

        myCanvasView.contentDescription = getString(R.string.canvasContentDescription)
        setContentView(myCanvasView)
    }
}