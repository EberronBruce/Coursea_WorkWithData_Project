package com.example.littlelemon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MenuNetwork(
    val menu : List<MenuItemNetwork>
)

@Serializable
data class MenuItemNetwork(
    val id : Int,
    val title : String,
    val price : String
) {
    fun toMenuItemRoom() = MenuItemRoom(
        // add code here
    )
}
