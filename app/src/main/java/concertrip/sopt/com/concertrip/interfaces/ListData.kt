package concertrip.sopt.com.concertrip.interfaces

import android.view.View

interface ListData {
    fun getType() : Int
    fun getId() : String
    fun getMainTitle(): String
    fun getSubTitle(): String
    fun getImageUrl(): String

}