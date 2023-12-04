package com.example.dependencyinjectionapptest.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionapptest.example2.di.IdQualifier
import com.example.dependencyinjectionapptest.example2.di.NameQualifier
import com.example.dependencyinjectionapptest.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
	private val useCase: ExampleUseCase,
	@IdQualifier private val id: String,
	@NameQualifier private val name: String
) : ViewModel() {
	fun method() {
		Log.d("EXAMPLE", "ExampleViewModel method(), $id, $name")
		useCase.invoke()
	}
}