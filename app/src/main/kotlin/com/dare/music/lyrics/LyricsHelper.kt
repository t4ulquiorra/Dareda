package com.dare.music.lyrics

import android.media.MediaMetadata
import androidx.media3.common.MediaMetadata as Media3Metadata
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import javax.inject.Inject

data class LyricsWithProvider(val lyrics: String?, val provider: String?)

class LyricsHelper @Inject constructor() {
    val preferred: Flow<Any> = emptyFlow()
    suspend fun getLyrics(mediaMetadata: Media3Metadata): LyricsWithProvider = LyricsWithProvider(null, null)
}
