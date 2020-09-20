package com.example.composetest.di

import com.example.composetest.TestingActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    companion object{
        const val MainActivityViewModel = TestingModule.NAME_VIEW_MODEL
    }

    @ContributesAndroidInjector(modules = [TestingModule::class])
    abstract fun bindTestingActivity(): TestingActivity
}