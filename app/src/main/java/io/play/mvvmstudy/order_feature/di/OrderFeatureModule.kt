package io.play.mvvmstudy.order_feature.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.play.mvvmstudy.core.data.local.DelivererDao
import io.play.mvvmstudy.core.data.local.OrderDao
import io.play.mvvmstudy.core.data.local.ProductDao
import io.play.mvvmstudy.order_feature.data.repository.OrderRepositoryImpl
import io.play.mvvmstudy.order_feature.domain.repository.OrderRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object OrderFeatureModule {

    @Provides
    @Singleton
    fun provideOrderRepository(orderDao: OrderDao,delivererDao: DelivererDao,productDao: ProductDao):OrderRepository{
        return OrderRepositoryImpl(orderDao, delivererDao, productDao)
    }
}