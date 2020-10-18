package com.example.madlevel4task1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "groceryTable")
data class Grocery(

    @ColumnInfo(name = "grocery")
    var groceryText: String,

    @ColumnInfo(name = "amount")
    var amountText: Int,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
)