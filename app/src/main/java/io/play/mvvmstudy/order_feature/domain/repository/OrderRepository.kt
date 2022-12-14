package io.play.mvvmstudy.order_feature.domain.repository

import io.play.mvvmstudy.core.domain.model.Deliverer
import io.play.mvvmstudy.core.domain.model.Product
import io.play.mvvmstudy.order_feature.domain.model.Order

interface OrderRepository {

    suspend fun insertOrder(order:Order)

    suspend fun getOrders():List<Order>

    suspend fun getDeliverers():List<Deliverer>

    suspend fun getProductsForDeliverer(delivererId:String): List<Product>

    suspend fun getDelivererNameById(delivererId:String):String
}