package com.example.dependencyinjectionapptest.example2.di

import com.example.dependencyinjectionapptest.example2.data.repository.ExampleRepositoryImp
import com.example.dependencyinjectionapptest.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

	@ApplicationScope
	@Binds
	fun bindRepository(impl: ExampleRepositoryImp): ExampleRepository

}