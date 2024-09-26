package com.revo.listviewactivity.model

import android.media.Image
import com.revo.listviewactivity.R

data class ModelBuah(
    val image: Int,
    val nama : String

)
//kita mock data untuk arraynya

object  MockList{

    fun getModel(): List<ModelBuah>{

        val itemModel1 = ModelBuah(
            R.drawable.apple,
            nama = "apple"
        )
        val itemModel2 = ModelBuah(
            R.drawable.grapes,
            nama = "anggur"
        )
        val itemModel3 = ModelBuah(
            R.drawable.orange,
            nama = "jeruk"
        )
        val itemModel4 = ModelBuah(
            R.drawable.pear,
            "pear"
        )
        val itemModel5 = ModelBuah(
            R.drawable.strawberry,
            nama = "strawberry"
        )
        val itemModel6 = ModelBuah(
            R.drawable.orange,
            nama = "orange"
        )

        val itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList
    }
}


