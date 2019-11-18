package br.com.caelum.twittelumapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TweetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tweet)

        val botao = findViewById<Button>(R.id.criar_tweet)

        botao.setOnClickListener(View.OnClickListener {
            publicaTweet()

            finish()
        })
    }

    private fun publicaTweet() {
        Log.i("tweet", "botão clicado")

        val campoDeMensagemDoTweet = findViewById<EditText>(R.id.tweet_mensagem)

        val mensagemDoTweet: String = campoDeMensagemDoTweet.text.toString()

        Toast.makeText(this, mensagemDoTweet, Toast.LENGTH_LONG).show()
    }
}
