package pe.edu.upc.teammatch.ui.search.adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import pe.edu.upc.teammatch.R
import pe.edu.upc.teammatch.data.entities.Team

class TeamAdapter(private val teams: ArrayList<Team>, private val context: Context) :
    RecyclerView.Adapter<TeamAdapter.TeamPrototype>() {

    inner class TeamPrototype(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private lateinit var cvTeam: CardView
        private lateinit var tvName: TextView
        private lateinit var btDelete: ImageButton

        fun bindTo(team: Team) {
            tvName = itemView.findViewById(R.id.tvName)
            btDelete = itemView.findViewById(R.id.btDelete)
            cvTeam = itemView.findViewById(R.id.cvTeam)

            tvName.text = team.name

            btDelete.setOnClickListener {
                teams.remove(team)
                this@TeamAdapter.notifyDataSetChanged()
            }

            cvTeam.setOnClickListener {
                val intent = Intent(context, TeamAdapter::class.java)
                intent.putExtra("name", team.name)
                (context as Activity).startActivityForResult(intent, 0)
            }
        }
    }

    fun onActivityResult(name: String?){
        teams[0].name = name!!
        notifyDataSetChanged()
    }

    // Vista por cada fila de acuerdo al diseño del prototipo
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamPrototype {
        val view = LayoutInflater.from(context).inflate(R.layout.prototype_team, parent, false)
        return TeamPrototype(view)
    }

    // Cantidad de elementos del recyclerview
    override fun getItemCount(): Int {
        return teams.size
    }

    // Información a mostrar en cada vista
    override fun onBindViewHolder(holder: TeamPrototype, position: Int) {
        holder.bindTo(teams[position])
    }

}