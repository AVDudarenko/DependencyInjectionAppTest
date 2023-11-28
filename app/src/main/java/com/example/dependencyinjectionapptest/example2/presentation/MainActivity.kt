package com.example.dependencyinjectionapptest.example2.presentation

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dependencyinjectionapptest.R
import com.example.dependencyinjectionapptest.example1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)

        val activity = Activity()
        activity.keyboard.toString()
        activity.mouse.toString()
        activity.processor.toString()
        activity.monitor.toString()
        activity.computer.toString()
    }
}