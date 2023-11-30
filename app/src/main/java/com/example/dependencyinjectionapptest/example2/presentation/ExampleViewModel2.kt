package com.example.dependencyinjectionapptest.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionapptest.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val useCase: ExampleUseCase
) : ViewModel() {

    fun method() {
        Log.d("EXAMPLE", "ExampleViewModel method()")
        useCase.invoke()
    }
}