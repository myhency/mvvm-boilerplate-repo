package io.play.mvvmstudy.order_feature.data.mapper

import io.play.mvvmstudy.core.data.local.entities.OrderEntity
import io.play.mvvmstudy.order_feature.domain.model.Order

fun Order.toOrderEntity(delivererName:String): OrderEntity {
    return OrderEntity(
        orderId = orderId,
        data = date,
        delivererName = delivererName,
        delivererTime = delivererTime
    )
}