package studio.ultoolapp.playdore.viewModel.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val message = MutableLiveData("Initialization")

    fun loadMessage() {
        message.postValue("Hello World!")
    }
}