package com.hutchison.multiplatformtut

import RocketComponent
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random
import kotlin.time.Duration.Companion.seconds

class Greeting {
    private val platform: Platform = getPlatform()
    private val rocketComponent = RocketComponent()

    fun greet(): Flow<String> = flow {
        emit(if (Random.nextBoolean()) "Hi Olivia!" else "Hello Olivia!")
        delay(1.seconds)
        emit("[Set Game Here]")
        delay(1.seconds)
        emit(daysPhrase())
        emit(rocketComponent.launchPhrase())
    }
}