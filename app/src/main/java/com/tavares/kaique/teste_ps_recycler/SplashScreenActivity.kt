package com.tavares.kaique.teste_ps_recycler

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    //Delimitando o tempo que queremos ficar na tela de splash
    //2.000 - 2 SEGUNDOS 3.000 3 SEGUDNOS
    //NÃO ESQUECER DO L
    val temposplash = 2000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        //Chamando a função de iniciar a animação de fade in fade out
        carregar()
    }

    fun carregar(){
        //Vou criar uma variavel para receber meu arquivo de animação XML
        //Chamo o arquivo meu em R.anim.nomedoarquivo
        val anim = AnimationUtils.loadAnimation(this,R.anim.animacao_splash)
        //Pego meu image view logo e starto uma animação a ele
        ivLogo.startAnimation(anim)
        //E também vou colocar a animação em text view que está escrito meu nome
        tvDev.startAnimation(anim)

        //Função responsavel por detectar o que delimitamos e iniciar a proxima tela
        Handler().postDelayed({
            //Após o tempo definido irá executar a proxima tela activity
            //Criando uma variavel que recebe a minha proxima activity
                val proximatela = Intent(this,ListaDeJogos_Activity::class.java)
                //Starto a acitivity, passando minha variavel
                startActivity(proximatela)
            //Aqui coloco minha variavel que dilimitei o tempo que quero ficar nesta activity
        },temposplash)
    }
}
