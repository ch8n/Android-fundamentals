package com.ch8n.lifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

abstract class BaseActivity : AppCompatActivity() {

    abstract val tagName: String

    init {
        Timber.plant(Timber.DebugTree())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.e("Lifecycle|${tagName}|onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.e("Lifecycle|${tagName}|onRestart")
    }

    override fun onStart() {
        super.onStart()
        Timber.e("Lifecycle|${tagName}|onStart")
    }

    override fun onResume() {
        super.onResume()
        Timber.e("Lifecycle|${tagName}|onResume")
    }

    override fun onPause() {
        super.onPause()
        Timber.e("Lifecycle|${tagName}|onPause")
    }

    override fun onStop() {
        super.onStop()
        Timber.e("Lifecycle|${tagName}|onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.e("Lifecycle|${tagName}|onDestroy")
    }

}