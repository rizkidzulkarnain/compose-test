package com.example.composetest.di

import com.example.composetest.viewmodel.TestingViewModelContract
import com.example.composetest.viewmodel.TestingViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class TestingModule {
    companion object{
        const val NAME_VIEW_MODEL = "TESTING_VIEW_MODEL"
    }

    @Provides
    @Named(NAME_VIEW_MODEL)
    fun provideViewModel(): TestingViewModelContract {
        return TestingViewModel()
    }
}