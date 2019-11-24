package br.com.caelum.twittelumapp.activity

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import br.com.caelum.twittelumapp.R
import br.com.caelum.twittelumapp.modelo.Tweet
import br.com.caelum.twittelumapp.viewmodel.TweetViewModel
import br.com.caelum.twittelumapp.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_lista.*

class ListaActivity : AppCompatActivity() {

    private val viewModel: TweetViewModel by lazy {
        ViewModelProviders.of(this, ViewModelFactory).get(TweetViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_lista)

        viewModel.lista().observe(this, observer())

        fab_add.setOnClickListener {
            val intencao = Intent(this, TweetActivity::class.java)

            startActivity(intencao)
        }
    }

    private fun observer(): Observer<List<Tweet>> {
        return Observer {
            lista_tweet.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, it)
        }
    }
}