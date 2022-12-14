package io.play.mvvmstudy.order_feature.domain.model

data class BoughtProduct(
    val productId:String,
    val name:String,
    val pricePerAmount:Float,
    val amount:Int
)
