package com.example.data.datasource

import android.annotation.SuppressLint
import com.example.domain.common.ResultState
import com.example.domain.entity.SomeEntity

/*@SuppressLint("CheckResult")
fun getQuestions(
    apiSource: SomeApiDataSource, page: Int,
    itemsPerPage: Int,
    onResult: (result: ResultState<List<SomeEntity>>) -> Unit
) {
    apiSource.getQuestions(page, itemsPerPage)
        .subscribe({ data ->
            onResult(ResultState.Success(data))
        }, { throwable ->
            onResult(ResultState.Error(throwable, null))
        })*
}*/

interface SomeApiDataSource : BaseDataSource {
    suspend fun getQuestions(page: Int, pageSize: Int): List<SomeEntity>
}