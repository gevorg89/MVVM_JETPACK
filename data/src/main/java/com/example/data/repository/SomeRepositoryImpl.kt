package com.example.data.repository

import com.example.data.datasource.SomeApiDataSource
import com.example.domain.common.ResultState
import com.example.domain.entity.SomeEntity
import com.example.domain.repository.SomeRepository

class SomeRepositoryImpl(private val apiSource: SomeApiDataSource) : SomeRepository {
    override fun getSomeData(): ResultState<List<SomeEntity>> {
        /*val data = apiSource.getQuestions(0, 100)
        return when (data.isNotEmpty()) {
            true -> {
                ResultState.Success(data)
            }
            false -> {
                ResultState.Loading(data, null)
            }
        }*/
        return ResultState.Success(emptyList())
    }

}