package com.serhiibaliasnyi.firmcard

import android.app.Application
import com.serhiibaliasnyi.firmcard.data.AppContainer
import com.serhiibaliasnyi.firmcard.data.DefaultAppContainer

class BooksApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}