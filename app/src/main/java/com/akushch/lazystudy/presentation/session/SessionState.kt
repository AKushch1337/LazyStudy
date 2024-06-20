package com.akushch.lazystudy.presentation.session

import com.akushch.lazystudy.domain.model.Session
import com.akushch.lazystudy.domain.model.Subject

data class SessionState(
    val subjects: List<Subject> = emptyList(),
    val sessions: List<Session> = emptyList(),
    val relatedToSubject: String? = null,
    val subjectId: Int? = null,
    val session: Session? = null
)