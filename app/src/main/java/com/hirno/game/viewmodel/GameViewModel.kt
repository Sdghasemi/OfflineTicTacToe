package com.hirno.game.viewmodel

import androidx.compose.ui.input.key.Key.Companion.Refresh
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hirno.game.model.TicTacToeScreenEffect
import com.hirno.game.model.TicTacToeScreenEvent
import com.hirno.game.model.TicTacToeScreenEvent.ScreenLoad
import com.hirno.game.model.TicTacToeScreenState
import com.hirno.game.model.TicTacToeScreenState.Searching

class GameViewModel : ViewModel() {

    private val viewState = MutableLiveData<TicTacToeScreenState>()

    private val viewAction = MutableLiveData<TicTacToeScreenEffect>()

    val obtainState: LiveData<TicTacToeScreenState> = viewState

    val obtainEffect: LiveData<TicTacToeScreenEffect> = viewAction

    fun event(event: TicTacToeScreenEvent) {
        when(event) {
            ScreenLoad -> {
                if (viewState.value == null) viewState.value = Searching
            }
        }
    }
}