package com.example.danp2023room.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "address")
data class AddressEntity (
    @PrimaryKey(autoGenerate = true)
    val addressId:Int,

    @ColumnInfo(name = "address")
    val address:String
)
