package pe.edu.upc.teammatch.data.remote.apiclient

import pe.edu.upc.teammatch.data.remote.`interface`.OrganizerInterface
import pe.edu.upc.teammatch.data.remote.`interface`.PlayerInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Organizer {
    //--Lack Authentication Token for consumed the API--//
    private const val API_BASE_URL = "https://obscure-mesa-76333.herokuapp.com/swagger-ui/index.html?configUrl=/tournament-api-docs/swagger-config#/"

    private var organizerInterface: OrganizerInterface? = null

    fun build(): OrganizerInterface {
        var builder: Retrofit.Builder = Retrofit.Builder()
            .baseUrl("API_BASE_URL")
            .addConverterFactory(GsonConverterFactory.create())
        var retrofit: Retrofit = builder.build()
        organizerInterface = retrofit.create(
            OrganizerInterface::class.java
        )
        return organizerInterface as OrganizerInterface

    }
}