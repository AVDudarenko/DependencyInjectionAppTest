package com.example.dependencyinjectionapptest.example2

import android.app.Application
import com.example.dependencyinjectionapptest.example2.di.DaggerApplicationComponent

class ExampleApp : Application() {

	val component by lazy {
		DaggerApplicationComponent.factory()
			.create(this, System.currentTimeMillis())
	}

}