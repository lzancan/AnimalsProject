package com.example.animalsproject

import com.example.animalsproject.di.ApiModule
import com.example.animalsproject.model.AnimalApiService

class ApiModuleTest(val mockService: AnimalApiService): ApiModule() {
    override fun provideAnimalApiService(): AnimalApiService {
        return mockService
    }
}