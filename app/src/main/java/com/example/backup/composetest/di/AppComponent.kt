package com.example.composetest.di

import com.example.composetest.TestingActivity
import dagger.Component

@Component(modules = [ActivityBuilder::class, TestingModule::class])
interface AppComponent {
    fun inject(activity: TestingActivity)
}