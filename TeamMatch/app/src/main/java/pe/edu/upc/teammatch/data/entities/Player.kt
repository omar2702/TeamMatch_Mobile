package pe.edu.upc.teammatch.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Player(
    @PrimaryKey
    val id: Int,

    @ColumnInfo
    val username: String,

    @ColumnInfo
    val password: String,

    @ColumnInfo
    val level: Int,

    @ColumnInfo
    val hoursPlayed: Int,

    @ColumnInfo
    val killDeathRatio: Float,

)

