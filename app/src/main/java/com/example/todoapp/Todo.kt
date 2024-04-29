package com.example.todoapp

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title: String,
    var CreatedAt : Date
)

@RequiresApi(Build.VERSION_CODES.O)
fun getFakeToDo() : List<Todo>{
    return listOf<Todo>(
        Todo(1,"First Todo", Date.from(Instant.now())),
        Todo(2,"My New Todo", Date.from(Instant.now())),
        Todo(3,"Third Todo", Date.from(Instant.now())),

    )
}