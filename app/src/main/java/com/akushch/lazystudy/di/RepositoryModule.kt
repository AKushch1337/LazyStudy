package com.akushch.lazystudy.di

import com.akushch.lazystudy.data.repository.SessionRepositoryImpl
import com.akushch.lazystudy.data.repository.SubjectRepositoryImpl
import com.akushch.lazystudy.data.repository.TaskRepositoryImpl
import com.akushch.lazystudy.domain.repository.SessionRepository
import com.akushch.lazystudy.domain.repository.SubjectRepository
import com.akushch.lazystudy.domain.repository.TaskRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindSubjectRepository(
        impl: SubjectRepositoryImpl
    ): SubjectRepository

    @Singleton
    @Binds
    abstract fun bindTaskRepository(
        impl: TaskRepositoryImpl
    ): TaskRepository

    @Singleton
    @Binds
    abstract fun bindSessionRepository(
        impl: SessionRepositoryImpl
    ): SessionRepository
}