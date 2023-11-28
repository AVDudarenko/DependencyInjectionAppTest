package com.example.dependencyinjectionapptest.example2.data.repository

import com.example.dependencyinjectionapptest.example2.data.datasource.ExampleLocalDataSource
import com.example.dependencyinjectionapptest.example2.data.datasource.ExampleRemoteDataSource
import com.example.dependencyinjectionapptest.example2.data.mapper.ExampleMapper
import com.example.dependencyinjectionapptest.example2.domain.ExampleRepository

class ExampleRepositoryImp(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {
    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}