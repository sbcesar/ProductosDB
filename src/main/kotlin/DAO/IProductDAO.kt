package org.example.DAO

import org.example.Entity.Product
import java.util.*

interface IProductDAO {
    fun createProduct(user: Product): Product?
    fun getAll(): List<Product>?
    fun getById(id: UUID): Product?
    fun update(user: Product): Product?
    fun delete(id: UUID): Boolean
}