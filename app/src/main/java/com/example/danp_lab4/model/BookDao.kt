package com.example.danp2023room.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.danp2023room.entities.BookEntity
import com.example.danp2023room.entities.StudentEntity

@Dao
interface BookDao {
    @Query("select * from book")
    suspend fun getAll(): List<BookEntity>

    @Insert
    suspend fun insert(bookEntity: BookEntity)

    @Insert
    suspend fun insert(booksEntity: List<BookEntity>)

    @Delete
    suspend fun delete(bookEntity: BookEntity)
}