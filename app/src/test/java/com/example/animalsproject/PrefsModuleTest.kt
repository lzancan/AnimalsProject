package com.example.animalsproject

import android.app.Application
import com.example.animalsproject.di.PrefsModule
import com.example.animalsproject.util.SharedPreferencesHelper

class PrefsModuleTest(val mockPrefs: SharedPreferencesHelper): PrefsModule() {
    override fun provideSharedPreferences(app: Application): SharedPreferencesHelper {
        return mockPrefs
    }
}