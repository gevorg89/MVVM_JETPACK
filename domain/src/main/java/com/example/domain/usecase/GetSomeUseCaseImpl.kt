package com.example.domain.usecase

import com.example.domain.common.ResultState
import com.example.domain.entity.SomeEntity
import com.example.domain.repository.SomeRepository


class GetSomeUseCaseImpl(
    private val repository: SomeRepository
) : GetSomeUseCase {
    override fun getSomeData(): ResultState<List<SomeEntity>> = repository.getSomeData()

}