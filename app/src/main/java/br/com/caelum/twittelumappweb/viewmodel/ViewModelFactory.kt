package br.com.caelum.twittelumappweb.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.caelum.twittelumappweb.data.TweetRepository
import br.com.caelum.twittelumappweb.data.UsuarioRepository
import br.com.caelum.twittelumappweb.webservices.InicializadorDoRetrofit
import br.com.caelum.twittelumappweb.webservices.UsuarioWebClient

object ViewModelFactory : ViewModelProvider.NewInstanceFactory() {

    private fun getTweetRepository() = TweetRepository()

    private fun getUsuarioRepository(): UsuarioRepository {
        val retrofit = InicializadorDoRetrofit.retrofit

        val usuarioWebClient = UsuarioWebClient(retrofit)
        
        return UsuarioRepository(usuarioWebClient)
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T = when (modelClass) {
        TweetViewModel::class.java -> {
            TweetViewModel(getTweetRepository()) as T
        }
        else -> {
            UsuarioViewModel(getUsuarioRepository()) as T
        }
    }
}