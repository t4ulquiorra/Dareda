package com.dare.music.eq.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

class EQProfileRepository @Inject constructor() {
    val activeProfile: Flow<Any?> = MutableStateFlow(null)
}
