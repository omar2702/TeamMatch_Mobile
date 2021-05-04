package pe.edu.upc.teammatch.data.remote.`interface`

import pe.edu.upc.teammatch.data.remote.response.PlayerResponse
import retrofit2.Call
import retrofit2.http.*


interface PlayerInterface {

    @GET("/players")
    suspend fun getAllPlayers(@Query("api_key") apiKey: String): Call<PlayerResponse>

    @GET("/players/{playerId}")
    suspend fun getPlayerById(@Query("api_key") apiKey: Int): Call<PlayerResponse>

    //Error syntax
    @PUT("/players/{playerId}")
    suspend fun updatePlayer(/*@PUT("api_key"*) apiKey: Int*/): Call<PlayerResponse>

    //Error syntax
    @DELETE("/players/{playerId}")
    suspend fun deletePlayer(/*@DELETE("api_key") apiKey: Int*/): Call<PlayerResponse>

    @GET("/chats/{chatId}/players")
    suspend fun getAllPlayersByChatId()

    @POST("/players/{playerId}/chats/{chatId}")
    suspend fun addPlayerToChat()

    @DELETE("/players/{playerId}/chats/{chatId}")
    suspend fun deletePlayerFromChat()



}