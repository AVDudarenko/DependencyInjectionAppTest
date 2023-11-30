package com.example.dependencyinjectionapptest.example2.data.datasource

import android.util.Log
import com.example.dependencyinjectionapptest.example2.data.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
	private val database: ExampleDatabase
) : ExampleLocalDataSource {
	override fun method() {
		Log.d("EXAMPLE", "ExampleLocalDataSourceImpl method()")
		database.method()
	}
}