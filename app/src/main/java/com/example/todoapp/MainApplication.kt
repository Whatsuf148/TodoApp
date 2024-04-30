package com.example.todoapp

import android.app.Application
import androidx.room.Room
import com.example.todoapp.DB.TodoDatabase

class MainApplication: Application() {

    companion object{

        lateinit var todoDatabase: TodoDatabase
    }

    override fun onCreate() {
        super.onCreate()
       todoDatabase=  Room.databaseBuilder(applicationContext,
            TodoDatabase::class.java,
            TodoDatabase.name
        ).build()

    }

}