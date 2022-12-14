package io.play.mvvmstudy.core.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.play.mvvmstudy.core.data.local.entities.ProductEntity

@Dao
interface ProductDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduct(productEntity: ProductEntity)

    @Query("SELECT * FROM productentity WHERE belongsToDeliverer = :delivererId")
    suspend fun getProductsForDeliverer(delivererId:String):List<ProductEntity>
}