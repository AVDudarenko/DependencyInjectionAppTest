package com.example.dependencyinjectionapptest.example2.data.database

import android.content.Context
import android.util.Log
import com.example.dependencyinjectionapptest.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
	private val context: Context
) {

	fun method() {
		Log.d(TAG_NAME, "Example database ${context.getString(R.string.app_name)}")
	}

	companion object {
		private const val TAG_NAME = "EXAMPLE"
	}
}