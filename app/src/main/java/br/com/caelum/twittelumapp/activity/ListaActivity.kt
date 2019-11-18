package br.com.caelum.twittelumapp.activity

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import br.com.caelum.twittelumapp.R
import br.com.caelum.twittelumapp.TweetActivity
import br.com.caelum.twittelumapp.bancodedados.TwittelumDatabase
import br.com.caelum.twittelumapp.modelo.Tweet
import kotlinx.android.synthetic.main.activity_lista.*

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_lista)

        val tweetDao = TwittelumDatabase.getInstance(this).tweetDao()
        val tweets: List<Tweet> = tweetDao.lista()

        val adapter = ArrayAdapter<Tweet>(this, android.R.layout.simple_list_item_1, tweets)

        lista_tweet.adapter = adapter

        fab_add.setOnClickListener {
            val intencao = Intent(this, TweetActivity::class.java)

            startActivity(intencao)
        }
    }
}