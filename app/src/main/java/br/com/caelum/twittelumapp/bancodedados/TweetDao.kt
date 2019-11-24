package br.com.caelum.twittelumapp.bancodedados

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.com.caelum.twittelumapp.modelo.Tweet

@Dao
interface TweetDao {

    @Insert
    fun salva(tweet: Tweet)

    @Query("select * from Tweet")
    fun lista(): LiveData<List<Tweet>>
}