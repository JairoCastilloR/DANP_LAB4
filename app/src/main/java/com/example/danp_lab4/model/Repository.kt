package com.example.danp2023room.model

import com.example.danp2023room.entities.BookEntity
import com.example.danp2023room.entities.StudentEntity
import com.example.danp2023room.entities.StudentWithBooks
import com.example.danp2023room.entities.UnitEntity
import com.example.danp_lab04.entities.UnitWithStudent

class Repository(private val appDatabase: AppDatabase) {

    suspend fun getAllStudents(): List<StudentEntity> {
        return appDatabase.studentDao().getAll()
    }

    suspend fun getStudentWithBooks(): List<StudentWithBooks> {
        return appDatabase.studentDao().getStudentWithBooks()
    }

    suspend fun insertStudents(studentsEntity: List<StudentEntity>) {
        appDatabase.studentDao().insert(studentsEntity)
    }

    suspend fun insertBooks(books: List<BookEntity>) {
        appDatabase.bookDao().insert(books)
    }

    suspend fun insertBook(book: BookEntity) {
        appDatabase.bookDao().insert(book)
    }

    suspend fun getAllBooks(): List<BookEntity> {
        return appDatabase.bookDao().getAll()
    }

    suspend fun insertUnit(unitEntity: List<UnitEntity>) {
        return appDatabase.unitDao().insert(unitEntity)
    }

    suspend fun insertUnit(unitEntity: UnitEntity) {
        return appDatabase.unitDao().insert(unitEntity)
    }

    suspend fun getUnitsWithStudents(): List<UnitWithStudent> {
        return appDatabase.unitDao().getAllUnits()
    }
}
