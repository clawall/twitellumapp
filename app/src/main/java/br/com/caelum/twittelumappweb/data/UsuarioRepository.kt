package br.com.caelum.twittelumappweb.data

import android.util.Log
import br.com.caelum.twittelumappweb.modelo.Usuario

class UsuarioRepository {

    fun entra(usuario: Usuario) {
        Log.i("loginConta", "$usuario")
    }

    fun cadastra(usuario: Usuario) {
        Log.i("criaConta", "$usuario")
    }
}