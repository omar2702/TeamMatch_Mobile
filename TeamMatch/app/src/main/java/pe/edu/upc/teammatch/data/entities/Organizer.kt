package pe.edu.upc.teammatch.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Organizer (
    @PrimaryKey
    val id: Int,

    @ColumnInfo
    val username: String,

    @ColumnInfo
    val password: String,
)