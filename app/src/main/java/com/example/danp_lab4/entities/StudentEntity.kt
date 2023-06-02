package com.example.danp2023room.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student")
data class StudentEntity(
    @PrimaryKey
    val studentId: Int,

    @ColumnInfo(name="apellido_nombre")
    val fullname: String
){
    override fun toString(): String {
        return "Student : $fullname"
    }
}