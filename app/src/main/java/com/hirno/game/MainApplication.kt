package com.hirno.game

import android.app.Application
import com.hirno.game.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module


class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        setupDependencyInjection()
    }

    private fun setupDependencyInjection() {
        startKoin {
            androidLogger()
            androidContext(this@MainApplication)
            modules(
                appModule,
                module {
                    single { this@MainApplication }
                }
            )
        }
    }
}