package com.example.madlevel4task1

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface GroceryDAO {

    @Query("SELECT * FROM groceryTable")
    suspend fun getAllProducts(): List<Grocery>

    @Insert
    suspend fun insertProduct(grocery: Grocery)

    @Delete
    suspend fun deleteProduct(grocery: Grocery)

    @Query("DELETE FROM groceryTable")
    suspend fun deleteAllProducts()

}
