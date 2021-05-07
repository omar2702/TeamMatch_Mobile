package pe.edu.upc.teammatch.data.remote.`interface`

import pe.edu.upc.teammatch.data.entities.Auth
import pe.edu.upc.teammatch.data.remote.response.AuthResponse
import pe.edu.upc.teammatch.data.remote.response.ChatResponse
import pe.edu.upc.teammatch.data.remote.response.PlayerResponse
import retrofit2.Call
import retrofit2.http.*

//Lack Implemented methods
interface AuthInterface {
    @POST("/api/auth/sign-in")
    fun logIn(@Body auth:Auth): Call<AuthResponse>

}