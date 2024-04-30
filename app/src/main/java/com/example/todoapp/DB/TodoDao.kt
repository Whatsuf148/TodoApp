package com.example.todoapp.DB

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.todoapp.Todo

@Dao
interface TodoDao {
     @Query("Select * from todo order by id Desc")
    fun getAllData():LiveData<List<Todo>>

@Insert
    fun addToDo(todo: Todo)

    @Query("DELETE  FROM TODO WHERE ID=:id")
    fun deleteTodo(id:Int)

}