package com.defaultxyz.planday

import android.app.Application
import com.facebook.appevents.AppEventsLogger

class BasicApp : Application() {

    override fun onCreate() {
        super.onCreate()
        AppEventsLogger.activateApp(this)
    }
}