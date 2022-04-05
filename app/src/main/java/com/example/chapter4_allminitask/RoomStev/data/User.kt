package com.example.chapter4_allminitask.RoomStev.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val firstName : String,
    val lastName : String,
    val age : Int
)
