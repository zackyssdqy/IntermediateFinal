package com.dicoding.picodiploma.loginwithanimation.view.signup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.loginwithanimation.data.repository.UserRepository
import com.dicoding.picodiploma.loginwithanimation.response.SignupResponse

class SignupViewModel(private val repository: UserRepository) : ViewModel() {

    private val _registrationResult = MutableLiveData<SignupResponse>()
    val registrationResult: LiveData<SignupResponse> get() = _registrationResult

    fun register(name: String, email: String, password: String) =
        repository.register(name, email, password)
}