package pe.edu.upc.teammatch.data.entities

data class Filter (

    val id: Int,

    val game: String,

    val age: Int,

    val region: String,

    val gameStyle: String,

    val accountLevel: Int,

    val rating: Float,
)