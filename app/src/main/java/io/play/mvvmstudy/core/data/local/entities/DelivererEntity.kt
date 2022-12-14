package io.play.mvvmstudy.core.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DelivererEntity(
    @PrimaryKey val delivererId:String,
    val name: String
)
