package com.example.domain.usecase

import com.example.domain.common.ResultState
import com.example.domain.entity.SomeEntity

interface GetSomeUseCase : BaseUseCase {
    fun getSomeData(): ResultState<List<SomeEntity>>
}