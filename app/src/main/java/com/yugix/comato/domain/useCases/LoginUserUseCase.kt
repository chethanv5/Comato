package com.yugix.comato.domain.useCases

import com.yugix.comato.common.ResultState
import com.yugix.comato.data.models.UserData
import com.yugix.comato.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoginUserUseCase @Inject constructor(val repo : Repo) {

    fun loginUser(userData: UserData): Flow<ResultState<String>>{
        return repo.loginWithEmailAndPassword(userData)
    }

}