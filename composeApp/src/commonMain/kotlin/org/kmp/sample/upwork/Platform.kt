package org.kmp.sample.upwork

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform