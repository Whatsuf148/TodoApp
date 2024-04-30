package com.example.todoapp.DB

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.todoapp.Todo

@Database(entities = [Todo::class ], version = 1)
@TypeConverters(Converters::class)
abstract class TodoDatabase : RoomDatabase() {

    companion object{
        const val name = "Todo_DB"
    }

    abstract fun getDao():TodoDao

}