package com.dicoding.picodiploma.loginwithanimation.view.map

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.dicoding.picodiploma.loginwithanimation.data.pref.UserModel
import com.dicoding.picodiploma.loginwithanimation.data.repository.UserRepository
import com.dicoding.picodiploma.loginwithanimation.response.StoryResponse
import kotlinx.coroutines.launch

class MapsViewModel(private val repository: UserRepository) : ViewModel() {

    private val _StoryWithLocation = MutableLiveData<StoryResponse>()
    val StoryWithLocation: LiveData<StoryResponse> = _StoryWithLocation

    fun getSession(): LiveData<UserModel> {
        return repository.getSession().asLiveData()
    }

    fun getStoryWithLocation(token: String) {
        viewModelScope.launch {
            val storyResponse = repository.getStoriesByMap(token)
            _StoryWithLocation.postValue(storyResponse)
        }
    }
}
