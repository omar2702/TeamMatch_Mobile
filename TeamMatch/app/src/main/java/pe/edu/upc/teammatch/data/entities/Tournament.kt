package pe.edu.upc.teammatch.data.entities

import java.util.*


data class Tournament (

    val id: Int,

    val description: String,

    val prize: String,

    val publicTournament: Boolean,

    val code: String,

    val dateOfTournament: Date,

    val maxTeams: Int,
)