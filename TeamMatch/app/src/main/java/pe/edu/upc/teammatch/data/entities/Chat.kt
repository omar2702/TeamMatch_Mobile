package pe.edu.upc.teammatch.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Chat (
    @PrimaryKey
    val id: Int,
)