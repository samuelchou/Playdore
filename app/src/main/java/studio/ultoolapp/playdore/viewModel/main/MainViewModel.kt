package studio.ultoolapp.playdore.viewModel.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import studio.ultoolapp.playdore.repository.WelcomeRepository
import studio.ultoolapp.playdore.repository.WelcomeRepositoryImpl

class MainViewModel : ViewModel() {
    private val repository: WelcomeRepository = WelcomeRepositoryImpl()

    val message = MutableLiveData("Initialization")

    fun loadMessage() {
        repository.getWelcomeMessage().let {
            message.postValue(it)
        }
    }
}