package taydastahsin.com.todoaplication.ui.viewmodel

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import taydastahsin.com.todoaplication.data.repo.todoRepository
import javax.inject.Inject

@HiltViewModel
class DetayViewModel @Inject constructor(var trepo:todoRepository) {

    fun guncelle(todo_id:Int,todo_baslik: String,todo_bilgi: String){
        CoroutineScope(Dispatchers.Main).launch {
            trepo.guncelle(todo_id,todo_baslik,todo_bilgi)
        }
    }

    fun sil(todo_id: Int){
        CoroutineScope(Dispatchers.Main).launch {
            trepo.sil(todo_id)
        }
    }

}