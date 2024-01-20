package com.rahulrv.newsinshort

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by  ${USER} ON ${DATE}
 */
@HiltAndroidApp
class NewsApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "App onCreate() called")
    }

    companion object {
        const val TAG = "NewApplication"
    }

}