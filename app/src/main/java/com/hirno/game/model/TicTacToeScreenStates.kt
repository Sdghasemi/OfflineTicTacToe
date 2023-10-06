package com.hirno.game.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

sealed class TicTacToeScreenState {
    @Parcelize
    data object Searching : TicTacToeScreenState(), Parcelable

    @Parcelize
    data object OngoingGame : TicTacToeScreenState(), Parcelable
}

sealed class TicTacToeScreenEvent {
    data object ScreenLoad : TicTacToeScreenEvent()
}

sealed class TicTacToeScreenEffect {
    data object StopSearching : TicTacToeScreenEffect()
    data object NavigateToTicTacToeScreen : TicTacToeScreenEffect()
}