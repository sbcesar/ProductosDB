package org.example

import org.example.Entity.Product
import org.example.DAO.ProductDAO

fun main() {
    val product = Product(1, "Smartphone", 999.99f, "The latest smartphone model", "Apple", "Electronics")

    val productId = ProductDAO().createProduct(product)

    println("Product ID: $productId")
}