package com.yugix.comato.domain.repo

import com.yugix.comato.common.ResultState
import com.yugix.comato.data.models.UserData
import kotlinx.coroutines.flow.Flow

interface Repo {

    fun loginWithEmailAndPassword(userData: UserData): Flow<ResultState<String>>
    fun registerWithEmailAndPassword(userData: UserData): Flow<ResultState<String>>
}