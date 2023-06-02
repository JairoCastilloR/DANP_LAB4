package com.example.danp_lab04.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import com.example.danp2023room.entities.UnitEntity
import com.example.danp_lab04.entities.UnitWithStudent

@Dao
interface UnitDao {
    @Insert
    suspend fun insert(unitEntity: List<UnitEntity>)

    @Insert
    suspend fun insert(unitEntity: UnitEntity)

    @Transaction
    @Query("SELECT * FROM unit")
    suspend fun getAllUnits(): List<UnitWithStudent>
}