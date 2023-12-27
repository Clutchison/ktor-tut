package com.hutchison.multiplatformtut

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): List<String> = buildList {
        add(if (Random.nextBoolean()) "Hi Olivia!" else "Hello Olivia!")
        add("[Set Game Here]")
        add(daysPhrase())
    }
}