package com.example.dependencyinjectionapptest.example2.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.dependencyinjectionapptest.R
import com.example.dependencyinjectionapptest.example2.ExampleApp
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

	@Inject
	lateinit var viewModel: ExampleViewModel

	private val component by lazy {
		(application as ExampleApp).component
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		Log.d("EXAMPLE", "onCreate")
		component.inject(this)
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		viewModel.method()

	}
}