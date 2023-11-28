package com.example.dependencyinjectionapptest.example2.data.datasource

class ExampleLocalDataSourceImpl(
private val database:ExampleDataBase
):ExampleLocalDataSource {
    override fun method() {
        databse.method
    }
}