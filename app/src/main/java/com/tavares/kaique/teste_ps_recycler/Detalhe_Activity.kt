package com.tavares.kaique.teste_ps_recycler

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import com.tavares.kaique.teste_ps_recycler.model.Heroi
import kotlinx.android.synthetic.main.activity_detalhe_.*

class Detalhe_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_)
        setSupportActionBar(toolbar)

        //Recuperando meu objeto que passei da outra tela
        //Por meio de uma variavel que deve ser chamada como getParcelableExtra<Devo passar meu arquivo Kotlin>
        //Name é o nome do meu putExtra
        val heroi = intent.getParcelableExtra<Heroi>("heroi")
        //Trocando o nome do titulo pegando o objeto
        toolbar_layout.title = heroi.titulo
        tvDescricaoDetalhe.text= heroi.descricao
        ivDetalheHeroi.setImageDrawable(ContextCompat.getDrawable(this,heroi.resourceId))
        tvForca.text = heroi.forca.toString()
        tvVelocidade.text = heroi.velocidade.toString()


    }
}
