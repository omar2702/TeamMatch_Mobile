package pe.edu.upc.teammatch.data.remote.apiclient

import com.google.gson.Gson
import pe.edu.upc.teammatch.data.remote.`interface`.PlayerInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


object Player{

    //--Lack Authentication Token for consumed the API--//
    private const val API_BASE_URL = "https://obscure-mesa-76333.herokuapp.com/swagger-ui/index.html?configUrl=/tournament-api-docs/swagger-config#/"

    private var playerInterface: PlayerInterface? = null

    fun build(): PlayerInterface {
        var builder: Retrofit.Builder = Retrofit.Builder()
            .baseUrl("API_BASE_URL")
            .addConverterFactory(GsonConverterFactory.create())
        var retrofit: Retrofit = builder.build()
        playerInterface = retrofit.create(
            PlayerInterface::class.java
        )
        return playerInterface as PlayerInterface

    }



}