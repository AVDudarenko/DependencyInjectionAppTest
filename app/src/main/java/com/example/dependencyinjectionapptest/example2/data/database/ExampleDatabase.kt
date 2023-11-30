package com.example.dependencyinjectionapptest.example2.data.database

import android.content.Context
import android.util.Log
import com.example.dependencyinjectionapptest.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleDatabase @Inject constructor(
	private val context: Context,
	private val currentTimeMillis: Long
) {

	fun method() {
		Log.d(
			TAG_NAME,
			"Example database ${context.getString(R.string.app_name)}, $currentTimeMillis, $this"
		)
	}

	companion object {
		private const val TAG_NAME = "EXAMPLE"
	}
}