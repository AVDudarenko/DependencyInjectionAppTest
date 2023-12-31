package com.example.dependencyinjectionapptest.example2.di

import com.example.dependencyinjectionapptest.example2.data.datasource.ExampleLocalDataSource
import com.example.dependencyinjectionapptest.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionapptest.example2.data.datasource.ExampleRemoteDataSource
import com.example.dependencyinjectionapptest.example2.data.datasource.ExampleRemoteDataSourceImpl
import com.example.dependencyinjectionapptest.example2.data.datasource.TestRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

	@ApplicationScope
	@Binds
	fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

	@ProdQualifier
	@ApplicationScope
	@Binds
	fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

	@TestQualifier
	@ApplicationScope
	@Binds
	fun bindTestRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource

}