package com.example.composetest

import android.app.Application
import com.example.composetest.di.DaggerAppComponent

class MainApplication : Application() {
    val component = DaggerAppComponent.create()
}