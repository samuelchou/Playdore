package studio.ultoolapp.playdore.viewModel.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import studio.ultoolapp.playdore.repository.WelcomeRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: WelcomeRepository,
) : ViewModel() {

    val message = MutableLiveData("Initialization")

    fun loadMessage() {
        repository.getWelcomeMessage().let {
            message.postValue(it)
        }
    }
}