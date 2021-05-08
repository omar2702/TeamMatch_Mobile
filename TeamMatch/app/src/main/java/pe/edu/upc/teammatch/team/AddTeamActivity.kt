package pe.edu.upc.teammatch.team

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.edu.upc.teammatch.R
import pe.edu.upc.teammatch.data.entities.Team
import pe.edu.upc.teammatch.ui.search.adapter.TeamAdapter

class AddTeamActivity : AppCompatActivity() {

    private lateinit var btAdd: Button
    private lateinit var etName: EditText
    private lateinit var rvServices: RecyclerView

    private var teams = ArrayList<Team>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_team)
        initViews()
        initListeners()
    }

    private fun initListeners() {
        btAdd.setOnClickListener {
            val name = etName.text.toString()
            val team = Team(name)
            if (name.isEmpty()) {
                Toast.makeText(this, "Product's name is missing", Toast.LENGTH_SHORT).show()
            } else {
                teams.add(team)
                rvServices.adapter?.notifyDataSetChanged()
            }
        }
    }

    private fun initViews() {
        btAdd = findViewById(R.id.btAdd)
        etName = findViewById(R.id.etName)
        rvServices = findViewById(R.id.rvProducts)

        val productAdapter = TeamAdapter(teams, this)
        rvServices.adapter = productAdapter
        rvServices.layoutManager = LinearLayoutManager(this)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK){
            if (requestCode == 0) {
                val name = data?.getStringExtra("name")
                (rvServices.adapter as TeamAdapter).onActivityResult(name)
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

}