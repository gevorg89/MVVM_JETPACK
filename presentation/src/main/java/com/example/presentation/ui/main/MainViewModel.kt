package com.example.presentation.ui.main

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.domain.usecase.GetSomeUseCase

class MainViewModel @ViewModelInject constructor(var someUseCase: GetSomeUseCase) : ViewModel() {
    fun getData(){
        //val t = someUseCase.getSomeData()
        println()
    }
}