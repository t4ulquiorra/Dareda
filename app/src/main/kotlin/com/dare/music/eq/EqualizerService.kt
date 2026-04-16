package com.dare.music.eq

import javax.inject.Inject

class EqualizerService @Inject constructor() {
    fun addAudioProcessor(processor: Any) {}
    fun applyProfile(profile: Any): Result<Unit> = Result.success(Unit)
    fun disable() {}
}
