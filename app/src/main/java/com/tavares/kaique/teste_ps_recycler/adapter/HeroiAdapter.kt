package com.tavares.kaique.teste_ps_recycler.adapter

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tavares.kaique.teste_ps_recycler.R
import com.tavares.kaique.teste_ps_recycler.model.Heroi
import kotlinx.android.synthetic.main.meu_jogo_item.view.*


/**
 * Created by kaiqu on 15/06/2018.
 */

class HeroiAdapter(private val herois: List <Heroi>,
                   val context: Context,
                   val listener: (Heroi) -> Unit): RecyclerView.Adapter <HeroiAdapter.ViewHolder>(){
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val heroiPosition = herois[position]
        holder?.let{
           it.bindView(heroiPosition,listener)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val view = LayoutInflater.from(context).inflate(
                R.layout.meu_jogo_item,parent,false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return herois.size
    }


class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    fun bindView (heroi : Heroi,
                  listener: (Heroi) -> Unit) = with(itemView){
                      val tvNome = tvNome
                      val ivHeroi = ivHeroi
                      val tvDescricao = tvDescricao

                      ivHeroi.setImageDrawable(ContextCompat.getDrawable(context,heroi.resourceId))
                      tvNome.text = heroi.titulo
                      tvDescricao.text = heroi.descricao

                      setOnClickListener{listener(heroi)}
                  }
}


}