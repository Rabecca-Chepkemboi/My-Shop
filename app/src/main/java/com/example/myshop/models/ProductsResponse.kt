package com.example.myshop.models

data class ProductsResponse(
    var products:List<Product>,
    var total:Int,
    var skip:Int,
    var limit:Int
)
