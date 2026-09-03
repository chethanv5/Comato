package com.yugix.comato.domain.useCases

import com.yugix.comato.common.ResultState
import com.yugix.comato.data.models.UserData
import com.yugix.comato.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CreateUserUseCase @Inject constructor(val repo : Repo) {

    fun createUser(userData: UserData): Flow<ResultState<String>>{
        return repo.registerWithEmailAndPassword(userData)
    }

}