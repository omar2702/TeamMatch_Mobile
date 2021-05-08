package pe.edu.upc.teammatch.data.remote.`interface`

import pe.edu.upc.teammatch.data.remote.response.OrganizerResponse
import pe.edu.upc.teammatch.data.remote.response.PlayerResponse
import retrofit2.Call
import retrofit2.http.*

//Lack Implemented methods
interface OrganizerInterface {
    @GET("/organizers")
    suspend fun getAllOrganizers(@Query("api_key") apiKey: String): Call<OrganizerResponse>

    @GET("/organizers/{organizerId}")
    suspend fun getOrganizerById(@Query("api_key") apiKey: Int): Call<OrganizerResponse>

    //Error syntax
    @POST("/organizers")
    suspend fun createOrganizer(/*@PUT("api_key"*) apiKey: Int*/): Call<OrganizerResponse>

    //Error syntax
    @PUT("/organizers/{organizerId}")
    suspend fun updateOrganizer(/*@DELETE("api_key") apiKey: Int*/): Call<OrganizerResponse>

    @DELETE("/organizers/{organizerId}")
    suspend fun deleteOrganizer()
}