package pe.edu.upc.teammatch.data.remote.apiclient

import pe.edu.upc.teammatch.data.remote.`interface`.ChatInterface
import pe.edu.upc.teammatch.data.remote.`interface`.PlayerInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Chat {
    //--Lack Authentication Token for consumed the API--//
    private const val API_BASE_URL = "https://obscure-mesa-76333.herokuapp.com/swagger-ui/index.html?configUrl=/tournament-api-docs/swagger-config#/"

    private var chatInterface: ChatInterface? = null

    fun build(): ChatInterface {
        var builder: Retrofit.Builder = Retrofit.Builder()
            .baseUrl("API_BASE_URL")
            .addConverterFactory(GsonConverterFactory.create())
        var retrofit: Retrofit = builder.build()
        chatInterface = retrofit.create(
            ChatInterface::class.java
        )
        return chatInterface as ChatInterface

    }
}