package io.play.mvvmstudy.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import io.play.mvvmstudy.core.data.local.entities.DelivererEntity
import io.play.mvvmstudy.core.data.local.entities.OrderEntity
import io.play.mvvmstudy.core.data.local.entities.OrderProductEntity
import io.play.mvvmstudy.core.data.local.entities.ProductEntity

@Database(
    entities = [
        DelivererEntity::class,
        OrderEntity::class,
        OrderProductEntity::class,
        ProductEntity::class
    ],
    version = 1
)
abstract class OrderDatabase : RoomDatabase() {
    abstract fun orderDao():OrderDao
    abstract fun productDao():ProductDao
    abstract fun delivererDao():DelivererDao
}