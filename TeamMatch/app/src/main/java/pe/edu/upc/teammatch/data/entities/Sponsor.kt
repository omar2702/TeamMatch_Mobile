package pe.edu.upc.teammatch.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Sponsor (
    @PrimaryKey
    val id: Int,

    @ColumnInfo
    val name: String,

    @ColumnInfo
    val url: String,
)