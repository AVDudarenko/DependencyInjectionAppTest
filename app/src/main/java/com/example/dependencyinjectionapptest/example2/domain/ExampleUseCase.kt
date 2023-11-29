package com.example.dependencyinjectionapptest.example2.domain

class ExampleUseCase(
    private val repository: ExampleRepository
) {
    operator fun invoke() {
        repository.method()
    }
}