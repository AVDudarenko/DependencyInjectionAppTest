package com.example.dependencyinjectionapptest.example2.data.network

import android.content.Context
import android.util.Log
import com.example.dependencyinjectionapptest.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExampleApiService @Inject constructor(
	private val context: Context,
	private val currentTimeMillis: Long
) {

	fun method() {
		Log.d(
			TAG_NAME,
			"Example api service ${context.getString(R.string.app_name)}, $currentTimeMillis, $this"
		)
	}

	companion object {
		private const val TAG_NAME = "EXAMPLE"
	}

}