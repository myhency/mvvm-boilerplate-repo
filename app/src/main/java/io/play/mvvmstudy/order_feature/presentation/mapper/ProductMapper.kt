package io.play.mvvmstudy.order_feature.presentation.mapper

import io.play.mvvmstudy.order_feature.domain.model.BoughtProduct
import io.play.mvvmstudy.order_feature.presentation.state.ProductListItem

fun BoughtProduct.toProductListItem():ProductListItem {
    return ProductListItem(
        id = productId,
        name= name,
        pricePerAmount = pricePerAmount,
        selectedAmount = amount,
        isExpanded = false
    )
}