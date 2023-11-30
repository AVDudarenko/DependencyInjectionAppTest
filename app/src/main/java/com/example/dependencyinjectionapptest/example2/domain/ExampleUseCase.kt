package com.example.dependencyinjectionapptest.example2.domain

import android.util.Log
import javax.inject.Inject

class ExampleUseCase @Inject constructor(
	private val repository: ExampleRepository
) {
	operator fun invoke() {
		Log.d("EXAMPLE", "ExampleUseCase method()")
		repository.method()
	}
}