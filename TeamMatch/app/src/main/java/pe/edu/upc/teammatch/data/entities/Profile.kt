package pe.edu.upc.teammatch.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Profile (
    @PrimaryKey
    val id: Int,

    @ColumnInfo
    val firstName: String,

    @ColumnInfo
    val lastName: String,

    @ColumnInfo
    val description: String,

    @ColumnInfo
    val gender: String,

    @ColumnInfo
    val emailAddress: String,

    @ColumnInfo
    val phoneNumber: String,

    @ColumnInfo
    val birthDate: Date,
)