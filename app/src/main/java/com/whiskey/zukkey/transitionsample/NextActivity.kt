package com.whiskey.zukkey.transitionsample

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity


class NextActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_next)
    }
}