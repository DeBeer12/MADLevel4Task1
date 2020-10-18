package com.example.madlevel4task1

import android.content.Context

class GroceryRepository(context: Context) {

    private val groceryDao: GroceryDAO

    init {
        val database = ShoppingListRoomDatabase.getDatabase(context)
        groceryDao = database!!.groceryDao()
    }

    suspend fun getAllProducts(): List<Grocery> {
        return groceryDao.getAllProducts()
    }

    suspend fun insertProduct(grocery: Grocery) {
        groceryDao.insertProduct(grocery)
    }

    suspend fun deleteProduct(grocery: Grocery) {
        groceryDao.deleteProduct(grocery)
    }

    suspend fun deleteAllProducts() {
        groceryDao.deleteAllProducts()
    }

}
