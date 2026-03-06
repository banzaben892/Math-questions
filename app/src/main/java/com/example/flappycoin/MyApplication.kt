package com.example.flappycoin

import android.app.Application
import com.example.flappycoin.managers.GamePreferences
import com.example.flappycoin.managers.SoundManager

class MyApplication : Application() {
    companion object {
        lateinit var instance: MyApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        GamePreferences.init(this)
        SoundManager.init(this)
    }
}