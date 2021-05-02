package pe.edu.upc.teammatch.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TournamentMoreEnrollment (
    @PrimaryKey
    val id: Int,

    @ColumnInfo
    val enrollmentPlayer: Double,

    @ColumnInfo
    val commissionOrganizer: Double,

    @ColumnInfo
    val potChampion: Double,
)