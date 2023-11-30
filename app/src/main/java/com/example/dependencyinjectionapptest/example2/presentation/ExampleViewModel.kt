package com.example.dependencyinjectionapptest.example2.presentation

import android.util.Log
import com.example.dependencyinjectionapptest.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
	private val useCase: ExampleUseCase
) {
	fun method() {
		Log.d("EXAMPLE", "ExampleViewModel method()")
		useCase.invoke()
	}
}