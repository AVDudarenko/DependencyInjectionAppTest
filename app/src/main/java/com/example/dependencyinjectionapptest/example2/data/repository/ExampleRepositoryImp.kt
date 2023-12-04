package com.example.dependencyinjectionapptest.example2.data.repository

import android.util.Log
import com.example.dependencyinjectionapptest.example2.data.datasource.ExampleLocalDataSource
import com.example.dependencyinjectionapptest.example2.data.datasource.ExampleRemoteDataSource
import com.example.dependencyinjectionapptest.example2.data.mapper.ExampleMapper
import com.example.dependencyinjectionapptest.example2.di.ProdQualifier
import com.example.dependencyinjectionapptest.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImp @Inject constructor(
	private val localDataSource: ExampleLocalDataSource,
	@ProdQualifier private val remoteDataSource: ExampleRemoteDataSource,
	private val mapper: ExampleMapper
) : ExampleRepository {
	override fun method() {
		Log.d("EXAMPLE", "ExampleRepositoryImp method()")
		mapper.map()
		localDataSource.method()
		remoteDataSource.method()
	}
}