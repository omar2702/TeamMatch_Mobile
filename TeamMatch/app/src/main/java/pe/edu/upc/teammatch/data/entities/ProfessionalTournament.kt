package pe.edu.upc.teammatch.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProfessionalTournament (
    @PrimaryKey
    val id: Int,
)