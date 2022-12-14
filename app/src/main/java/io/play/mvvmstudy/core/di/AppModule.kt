package io.play.mvvmstudy.core.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.play.mvvmstudy.core.data.local.DelivererDao
import io.play.mvvmstudy.core.data.local.OrderDao
import io.play.mvvmstudy.core.data.local.OrderDatabase
import io.play.mvvmstudy.core.data.local.ProductDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideOrderDatabase(@ApplicationContext context: Context):OrderDatabase{
        return Room.databaseBuilder(
            context,
            OrderDatabase::class.java,
            "order_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideOrderDao(orderDatabase: OrderDatabase):OrderDao{
        return orderDatabase.orderDao()
    }

    @Provides
    @Singleton
    fun provideDelivererDao(orderDatabase: OrderDatabase):DelivererDao{
        return orderDatabase.delivererDao()
    }

    @Provides
    @Singleton
    fun provideProductDao(orderDatabase: OrderDatabase):ProductDao{
        return orderDatabase.productDao()
    }
}