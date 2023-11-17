package com.example.littlelemon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MenuNetwork(
    val menu : List<MenuItemNetwork>
)

@Serializable
data class MenuItemNetwork(

    @SerialName("id")
    val id : Int,

    @SerialName("title")
    val title : String,

    @SerialName("price")
    val price : String
) {
    fun toMenuItemRoom() = MenuItemRoom(
        id = id,
        title = title,
        price = price.toDouble()
    )
}
