package concertrip.sopt.com.concertrip.network.response

import android.support.design.bottomappbar.BottomAppBarTopEdgeTreatment
import com.google.gson.annotations.SerializedName
import concertrip.sopt.com.concertrip.model.Artist
import concertrip.sopt.com.concertrip.model.Concert
import concertrip.sopt.com.concertrip.model.Genre
import concertrip.sopt.com.concertrip.network.response.interfaces.BaseModel

data class GetSubscribedResponse(
    @SerializedName("data")
    var data : List<SubscribedData?>?
):BaseModel(){
    fun toArtistList() : ArrayList<Artist>{
        val list = ArrayList<Artist>()

        data?.forEach {
            if(it!=null)
            list.add(it.toArtist())
        }

        return list
    }
    fun toConcertList() : ArrayList<Concert>{
        val list = ArrayList<Concert>()

        data?.forEach {
            if(it!=null)
            list.add(it.toConcert())
        }

        return list
    }
    fun toGenreList() : ArrayList<Genre>{
        val list = ArrayList<Genre>()

        data?.forEach {
            if(it!=null)
            list.add(it.toGenre())
        }

        return list
    }
}

data class SubscribedData(
    var _id : String?,
    var name : String?,
    var profileImg : String?,
    var subscribe : Boolean?
){
    fun toArtist() : Artist {
        val a = Artist(_id?:"")

        a.name = name?:""
        a.profileImg = profileImg?:""
        a.subscribe = subscribe?:false

        return a
    }
    fun toConcert() : Concert {
        val a = Concert(_id?:"")

        a.title = name?:""
        a.profileImg = profileImg?:""
        a.subscribe = subscribe?:false

        return a
    }
    fun toGenre() : Genre{
        val a = Genre(_id?:"")

        a.name = name?:""
        a.profileImg = profileImg?:""
        a.subscribe = subscribe?:false

        return a
    }
}