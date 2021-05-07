package pe.edu.upc.teammatch.data.remote.response

import com.google.gson.annotations.SerializedName
import pe.edu.upc.teammatch.data.entities.Chat
import pe.edu.upc.teammatch.data.entities.Player

class AuthResponse (

    @SerializedName("username")
    var Username:String,
    @SerializedName("token")
    var Token:String

)