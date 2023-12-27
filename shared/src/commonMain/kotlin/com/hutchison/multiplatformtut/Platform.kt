package com.hutchison.multiplatformtut

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform