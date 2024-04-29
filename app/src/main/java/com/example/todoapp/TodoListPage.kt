package com.example.todoapp

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat
import java.util.Locale

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun TodoListPage() {
  val todoList = getFakeToDo()
   Column(
     modifier = Modifier
         .fillMaxSize()
         .padding(8.dp)
   ) {
     LazyColumn {
       itemsIndexed(todoList){
         index: Int, item :Todo->
         TodoItem(item = item)

       }
     }
   }
    

}

@Composable
fun TodoItem(item:Todo) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(
                MaterialTheme.colorScheme.primary
            )
            .padding(16.dp)
    ){
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(text = SimpleDateFormat("HH:mm:aa,dd-MM-yyyy", Locale.ENGLISH).format(item.CreatedAt),
                fontSize = 12.sp,
                color = Color.LightGray,
                )
            Text(text = item.title,
                fontSize = 20.sp,
                color = Color.White
            )

        }
        IconButton(onClick = {  }) {
            Icon(painter = painterResource(id = R.drawable.baseline_delete_24), contentDescription ="delete",
                tint = Color.White)
        }
    }
    
}