package com.dicoding.picodiploma.loginwithanimation.view.storyadd

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.loginwithanimation.data.repository.UserRepository
import java.io.File

class AddStoryViewModel(private val repository: UserRepository) : ViewModel() {
    fun uploadStory(token: String, file: File, description: String) =
        repository.uploadStory(token, file, description)
}