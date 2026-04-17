package com.dare.music.listentogether

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

class ListenTogetherManager @Inject constructor() {
    val roomState: Flow<Any?> = MutableStateFlow(null)
    fun initialize() {}
    fun setPlayerConnection(connection: Any?) {}
    fun joinRoom(code: String, username: String) {}
    fun disconnect() {}
}
