package io.play.mvvmstudy.core.data.mapper

import io.play.mvvmstudy.core.data.local.entities.DelivererEntity
import io.play.mvvmstudy.core.domain.model.Deliverer
import io.play.mvvmstudy.core.domain.model.Product

fun DelivererEntity.toDeliver(products:List<Product>):Deliverer {
    return Deliverer(
        delivererId = delivererId,
        name = name,
        products = products
    )
}