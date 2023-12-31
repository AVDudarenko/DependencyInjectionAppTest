package com.example.dependencyinjectionapptest.example2.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionapptest.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    private val viewModel2 by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel2::class.java]
    }

    private val component by lazy {
        (application as ExampleApp).component
			.activityComponentFactory()
			.create("MY_ID", "MY_NAME")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("EXAMPLE", "onCreate")
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
        viewModel2.method()

    }
}