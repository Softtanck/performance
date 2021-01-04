package com.xander.performance.demo

import android.app.Application
import android.content.Context
import com.xander.performance.pTool

class MyApplication : Application() {
  override fun attachBaseContext(base: Context) {
    super.attachBaseContext(base)
    pTool.init(pTool.Builder()
        .globalTag("demo")
        .checkUI(false, 500)
        .checkHandler(100)
        .checkThread(false)
        .checkFps(true)
        .checkIPC(false)
        .appContext(this)
        .build()
    )
  }
}