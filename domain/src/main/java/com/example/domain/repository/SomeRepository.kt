package com.example.domain.repository

import com.example.domain.common.ResultState
import com.example.domain.entity.SomeEntity

interface SomeRepository : BaseRepository {
    fun getSomeData(): ResultState<List<SomeEntity>>
}