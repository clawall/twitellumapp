package br.com.caelum.twittelumapp

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.caelum.twittelumapp.modelo.Tweet

class TweetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tweet)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.tweet_menu, menu)

        return true    // deve mostrar ou não?
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.tweet_menu_cadastrar -> {
                publicaTweet()

                finish()
            }

            android.R.id.home -> finish()
        }

        return false
    }

    private fun publicaTweet() {
        Log.i("tweet", "botão clicado")

        val campoDeMensagemDoTweet = findViewById<EditText>(R.id.tweet_mensagem)

        val mensagemDoTweet: String = campoDeMensagemDoTweet.text.toString()

        val tweet = Tweet(mensagemDoTweet)

        Toast.makeText(this, "$tweet", Toast.LENGTH_LONG).show()
    }
}
