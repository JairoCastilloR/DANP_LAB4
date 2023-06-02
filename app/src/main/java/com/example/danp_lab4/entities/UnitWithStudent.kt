package com.example.danp_lab04.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Relation
import com.example.danp2023room.entities.StudentEntity
import com.example.danp2023room.entities.UnitEntity


data class UnitWithStudent(
    @Embedded
    val unit: UnitEntity,

    @Relation(
        parentColumn = "studenCourseId",
        entityColumn = "studentId",
    )
    val students: List<StudentEntity> = emptyList()
)
