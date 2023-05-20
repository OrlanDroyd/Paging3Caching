package com.gmail.orlandroyd.beercaching.data.mappers

import com.gmail.orlandroyd.beercaching.data.local.BeerEntity
import com.gmail.orlandroyd.beercaching.data.remote.BeerDto
import com.gmail.orlandroyd.beercaching.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}