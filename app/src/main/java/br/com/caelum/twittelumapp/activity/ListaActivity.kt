package br.com.caelum.twittelumapp.activity

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import br.com.caelum.twittelumapp.R
import br.com.caelum.twittelumapp.TweetActivity
import kotlinx.android.synthetic.main.activity_lista.*

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_lista)

        val tweets = listOf(
            "Meu primeiro tweet",
            "Meu segundo tweet",
            "Meu terceiro tweet",
            "Meu quarto tweet",
            "Meu quinto tweet"
        )

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tweets)

        lista_tweet.adapter = adapter

        fab_add.setOnClickListener {
            val intencao = Intent(this, TweetActivity::class.java)
            
            startActivity(intencao)
        }
    }
}