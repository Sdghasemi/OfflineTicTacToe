package com.hirno.game.di

import com.hirno.game.viewmodel.GameViewModel
import com.hirno.gif.data.source.RandomDataSource
import com.hirno.gif.data.source.SearchDataSource
import com.hirno.gif.data.source.remote.RandomRemoteDataSource
import com.hirno.gif.data.source.remote.SearchRemoteDataSource
import com.hirno.gif.data.source.repository.RandomRepository
import com.hirno.gif.data.source.repository.RandomRepositoryImpl
import com.hirno.gif.data.source.repository.SearchRepository
import com.hirno.gif.data.source.repository.SearchRepositoryImpl
import com.hirno.gif.viewmodel.MainViewModel
import com.hirno.gif.viewmodel.RandomViewModel
import com.hirno.gif.viewmodel.SearchViewModel
import kotlinx.coroutines.Dispatchers
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

/**
 * Koin dependency injection modules declaration
 */
val appModule = module {
    viewModel { GameViewModel() }
}