package com.example.test2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform