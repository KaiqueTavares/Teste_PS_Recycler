package com.tavares.kaique.teste_ps_recycler

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.tavares.kaique.teste_ps_recycler.adapter.HeroiAdapter
import com.tavares.kaique.teste_ps_recycler.model.Heroi
import kotlinx.android.synthetic.main.activity_lista_de_jogos_.*

class ListaDeJogos_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_de_jogos_)

        rvMeusJogos.adapter = HeroiAdapter(herois(),this,{
            val telaDetalhe = Intent(this,Detalhe_Activity::class.java)
            telaDetalhe.putExtra("heroi",it)
            startActivity(telaDetalhe)
        })
       val layoutManager = LinearLayoutManager(this)
        rvMeusJogos.layoutManager = layoutManager
    }

    fun herois(): List<Heroi>{
        return  listOf(
                Heroi(getString(R.string.ironManHeader),
                        R.drawable.iron_man_header,
                        getString(R.string.descriptionIronMan),
                        3,6)
        )
    }
}
