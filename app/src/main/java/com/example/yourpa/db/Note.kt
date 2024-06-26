package com.example.yourpa.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
class Note(@ColumnInfo(name = "note_text") val text: String) {
    @PrimaryKey(autoGenerate = true) var id = 0
}