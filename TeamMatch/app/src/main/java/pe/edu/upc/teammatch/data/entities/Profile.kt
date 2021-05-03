package pe.edu.upc.teammatch.data.entities

import java.util.*


data class Profile (

    val id: Int,

    val firstName: String,

    val lastName: String,

    val description: String,

    val gender: String,

    val emailAddress: String,

    val phoneNumber: String,

    val birthDate: Date,
)