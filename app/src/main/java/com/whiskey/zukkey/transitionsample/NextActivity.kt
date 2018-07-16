package com.whiskey.zukkey.transitionsample

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.whiskey.zukkey.transitionsample.databinding.ActivityNextBinding


class NextActivity: AppCompatActivity() {

    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityNextBinding>(this, R.layout.activity_next)
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_next)
    }
}