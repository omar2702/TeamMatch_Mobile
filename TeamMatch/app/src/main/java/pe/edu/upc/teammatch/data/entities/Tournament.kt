package pe.edu.upc.teammatch.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Tournament (
    @PrimaryKey
    val id: Int,

    @ColumnInfo
    val description: String,

    @ColumnInfo
    val prize: String,

    @ColumnInfo
    val publicTournament: Boolean,

    @ColumnInfo
    val code: String,

    @ColumnInfo
    val dateOfTournament: Date,

    @ColumnInfo
    val maxTeams: Int,
)