package pe.edu.upc.teammatch.data.remote.`interface`

import pe.edu.upc.teammatch.data.remote.response.ChatResponse
import pe.edu.upc.teammatch.data.remote.response.PlayerResponse
import retrofit2.Call
import retrofit2.http.*

//Lack Implemented methods
interface ChatInterface {
    @GET("/chats")
    suspend fun getAllChats(@Query("api_key") apiKey: String): Call<ChatResponse>

    @GET("/players/{playerId}/chats")
    suspend fun getChatsByPlayerId(@Query("api_key") apiKey: Int): Call<ChatResponse>

    //Error syntax
    @GET("/chats/{chatId}")
    suspend fun getChatById(/*@PUT("api_key"*) apiKey: Int*/): Call<ChatResponse>

    //Error syntax
    @POST("/chats")
    suspend fun createChat(/*@DELETE("api_key") apiKey: Int*/): Call<ChatResponse>

    @DELETE("/chats/{chatId}")
    suspend fun deleteChat()
}