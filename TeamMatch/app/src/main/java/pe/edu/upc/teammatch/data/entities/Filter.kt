package pe.edu.upc.teammatch.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Filter (
    @PrimaryKey
    val id: Int,

    @ColumnInfo
    val game: String,

    @ColumnInfo
    val age: Int,

    @ColumnInfo
    val region: String,

    @ColumnInfo
    val gameStyle: String,

    @ColumnInfo
    val accountLevel: Int,

    @ColumnInfo
    val rating: Float,
)