package com.example.mvvm_jetpack.di.some

import com.example.data.api.NetworkApi
import com.example.data.datasource.SomeApiDataSource
import com.example.data.datasource.SomeApiDataSourceImpl
import com.example.data.repository.SomeRepositoryImpl
import com.example.domain.repository.SomeRepository
import com.example.domain.usecase.GetSomeUseCase
import com.example.domain.usecase.GetSomeUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(ApplicationComponent::class)
@Module
object SomeModule {

    @Provides
    fun provideSomeApiSource(networkApi: NetworkApi): SomeApiDataSource =
        SomeApiDataSourceImpl(networkApi)

    @Provides
    fun provideSomeRepository(
        apiSource: SomeApiDataSource
    ): SomeRepository {
        return SomeRepositoryImpl(apiSource)
    }

    @Provides
    //@PerFragment
    fun provideGetSomeUseCaseImpl(repository: SomeRepository): GetSomeUseCase =
        GetSomeUseCaseImpl(repository)

}