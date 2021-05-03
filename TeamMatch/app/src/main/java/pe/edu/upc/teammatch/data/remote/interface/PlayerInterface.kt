package pe.edu.upc.teammatch.data.remote.`interface`

import pe.edu.upc.teammatch.data.remote.response.PlayerResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface PlayerInterface {

    @GET("search/player")
    suspend fun searchPlayers(@Query("api_key") apiKey: String): Call<PlayerResponse>



}