package pe.edu.upc.teammatch.data.entities

data class Player(

    val playerId: Long,

    val username: String,

    val password: String,

    val level: Int,

    val hoursPlayed: Int,

    val killDeathRatio: Float,

)

