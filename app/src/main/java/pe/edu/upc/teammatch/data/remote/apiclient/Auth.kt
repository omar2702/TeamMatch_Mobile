package pe.edu.upc.teammatch.data.remote.apiclient

import pe.edu.upc.teammatch.data.remote.`interface`.AuthInterface
import pe.edu.upc.teammatch.data.remote.`interface`.ChatInterface
import pe.edu.upc.teammatch.data.remote.`interface`.PlayerInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Auth {
    //--Lack Authentication Token for consumed the API--//
    private const val API_BASE_URL = "https://obscure-mesa-76333.herokuapp.com"

    private var authInterface: AuthInterface? = null

    fun build(): AuthInterface {
        var builder: Retrofit.Builder = Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
        var retrofit: Retrofit = builder.build()
        authInterface = retrofit.create(
            AuthInterface::class.java
        )
        return authInterface as AuthInterface

    }
}