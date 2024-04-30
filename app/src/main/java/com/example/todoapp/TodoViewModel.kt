package com.example.todoapp

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.time.Instant
import java.util.Date

class TodoViewModel:ViewModel() {
    val TodoDao = MainApplication.todoDatabase.getDao()
    val todoList: LiveData<List<Todo>> = TodoDao.getAllData()




    @RequiresApi(Build.VERSION_CODES.O)
    fun addTodo(title:String) {
        viewModelScope.launch(Dispatchers.IO) {
            TodoDao.addToDo(Todo(title=title, CreatedAt = Date.from(Instant.now())))
        }


    }

    fun deleteTodo(id:Int){
        viewModelScope.launch(Dispatchers.IO){
            TodoDao.deleteTodo(id)
        }


    }


}