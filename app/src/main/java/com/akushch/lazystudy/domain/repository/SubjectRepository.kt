package com.akushch.lazystudy.domain.repository

import com.akushch.lazystudy.domain.model.Subject
import kotlinx.coroutines.flow.Flow

interface SubjectRepository {

    suspend fun upsertSubject(subject: Subject)

    fun getTotalSubjectCount(): Flow<Int>

    fun getTotalGoalHours(): Flow<Float>

    suspend fun deleteSubject(subjectInt: Int)

    suspend fun getSubjectById(subjectInt: Int): Subject?

    fun getAllSubjects(): Flow<List<Subject>>
}