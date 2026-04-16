package com.dare.music.utils

import com.dare.music.db.MusicDatabase
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class SyncUtils @Inject constructor(
    val database: MusicDatabase,
    val scope: CoroutineScope,
) {
    fun performFullSync() {}
    suspend fun performFullSyncSuspend() {}
    fun tryAutoSync() {}
    fun runAllSyncs() {}
    fun likeSong(s: com.dare.music.db.entities.SongEntity) {}
    fun subscribeChannel(channelId: String, subscribe: Boolean) {}
    fun savePodcast(podcastId: String, save: Boolean) {}
    fun saveEpisode(episodeId: String, save: Boolean, setVideoId: String? = null) {}
    fun syncLikedSongs() {}
    fun syncLibrarySongs() {}
    fun syncUploadedSongs() {}
}
