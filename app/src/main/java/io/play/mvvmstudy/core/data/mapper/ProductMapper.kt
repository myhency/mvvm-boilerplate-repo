package io.play.mvvmstudy.core.data.mapper

import io.play.mvvmstudy.core.data.local.entities.ProductEntity
import io.play.mvvmstudy.core.domain.model.Product

fun ProductEntity.toProduct():Product{
    return Product(
        productId = productId,
        name = name,
        pricePerAmount = pricePerAmount
    )
}