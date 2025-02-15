package otus.homework.coroutines

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CatsViewModelFactory(
    private val service: CatsService,
    private val serviceImg: CatsServiceImg
    ) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CatsViewModel(service, serviceImg) as T
    }
}