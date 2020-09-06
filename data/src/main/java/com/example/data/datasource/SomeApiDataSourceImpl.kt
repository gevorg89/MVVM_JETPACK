package com.example.data.datasource

import com.example.data.api.NetworkApi
import com.example.domain.entity.SomeEntity

class SomeApiDataSourceImpl(private val networkApi: NetworkApi) : SomeApiDataSource {
    override suspend fun getQuestions(page: Int, pageSize: Int): List<SomeEntity> {
        return networkApi.getQuestions(page, pageSize)
    }

}