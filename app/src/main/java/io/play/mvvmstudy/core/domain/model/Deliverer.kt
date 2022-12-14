package io.play.mvvmstudy.core.domain.model

data class Deliverer(
    val delivererId:String,
    val name: String,
    val products:List<Product>
)
