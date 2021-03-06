package concertrip.sopt.com.concertrip.network.response.data

import concertrip.sopt.com.concertrip.model.Caution

data class PrecautionData(
    var code : Int?,
    var name : String?,
    var img : String?
){
    fun toCaution() : Caution = Caution(img = img, content = name, code = code)


    override fun toString(): String ="PrecautionData{\n" +
            "code : $code\n" +
            "name : $name\n" +
            "img : $img\n}"
}