package org.example.Services

import org.example.DAO.ProductDAO
import org.example.Entity.Product
import java.util.*

class ProductServiceImpl(private val product: ProductDAO): IProductService {
    override fun create(user: Product): Product? {
        TODO("Not yet implemented")
    }

    override fun getById(id: UUID): Product? {
        TODO("Not yet implemented")
    }

    override fun update(user: Product): Product? {
        TODO("Not yet implemented")
    }

    override fun delete(id: UUID): Boolean {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<Product>? {
        TODO("Not yet implemented")
    }

}