package br.com.caelum.twittelumapp.bancodedados

import androidx.room.Dao
import androidx.room.Insert
import br.com.caelum.twittelumapp.modelo.Tweet

@Dao
interface TweetDao {

    @Insert
    fun salva(tweet: Tweet)
}