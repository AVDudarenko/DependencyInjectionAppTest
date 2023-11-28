package com.example.dependencyinjectionapptest.example2.presentation

import com.example.dependencyinjectionapptest.example2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {
    fun method() {
        useCase
    }
}