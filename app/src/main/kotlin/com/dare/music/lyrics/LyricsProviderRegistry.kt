package com.dare.music.lyrics

object LyricsProviderRegistry {
    val providerNames: List<String> = emptyList()
    fun getProviderByName(name: String): Any? = null
    fun getProviderName(provider: Any): String? = null
    fun deserializeProviderOrder(orderString: String): List<String> = emptyList()
    fun serializeProviderOrder(providers: List<String>): String = ""
    fun getDefaultProviderOrder(): List<String> = emptyList()
    fun getOrderedProviders(orderString: String): List<Any> = emptyList()
}
