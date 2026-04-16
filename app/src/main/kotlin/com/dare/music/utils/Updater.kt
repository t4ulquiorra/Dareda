package com.dare.music.utils

object Updater {
    suspend fun checkForUpdate(): Result<Pair<Any, Boolean>> = Result.success(Pair(Unit, false))
    fun getDownloadUrlForCurrentVariant(releaseInfo: Any): String? = null
}
