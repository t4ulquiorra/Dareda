package com.dare.music.utils

fun String.resize(width: Int, height: Int): String {
    return this
        .replace(Regex("=w\\d+-h\\d+"), "=w$width-h$height")
        .replace(Regex("=s\\d+"), "=w$width-h$height")
}
