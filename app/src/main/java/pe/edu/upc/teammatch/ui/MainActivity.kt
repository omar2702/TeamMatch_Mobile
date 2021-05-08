package pe.edu.upc.teammatch.ui

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import pe.edu.upc.teammatch.R
import pe.edu.upc.teammatch.data.remote.apiclient.Auth
import pe.edu.upc.teammatch.data.remote.response.AuthResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var authResponse:AuthResponse
    private lateinit var btLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initViews()
        initListeners()
    }

    private fun initListeners() {

        btLogin.setOnClickListener {
            var user=pe.edu.upc.teammatch.data.entities.Auth(etUsername.text.toString(),etPassword.text.toString(),"")
            login(user)
        }
    }

    private fun login(auth: pe.edu.upc.teammatch.data.entities.Auth) {

        val sharedPref:SharedPreferences = getSharedPreferences("Token", 0)

        val authInterface = Auth.build()
        val login = authInterface?.logIn(auth)

        login?.enqueue(object : Callback<AuthResponse> {
            override fun onFailure(call: Call<AuthResponse>, t: Throwable) {

            }

            override fun onResponse(call: Call<AuthResponse>, response: Response<AuthResponse>) {
                if (response.isSuccessful) {
                    val editor = sharedPref.edit()
                    editor.putString("Token", response.body()!!.Token)
                    print(response.body()!!.Token)
                    val toast = Toast.makeText(applicationContext,sharedPref.getString("Token","Token"),Toast.LENGTH_LONG)
                    toast.show()
                    print(sharedPref.getString("Token","Token").toString())
                }
            }
        }
        )
    }

    private fun initViews() {
        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btLogin = findViewById(R.id.btLogin)

    }

}