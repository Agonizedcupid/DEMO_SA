package com.innosonvehicles.cruise.rider.networking.socket

import com.innosonvehicles.cruise.common.models.Rider
import com.innosonvehicles.cruise.common.networking.socket.interfaces.SocketRequest
import com.innosonvehicles.cruise.common.utils.Adapters
import org.json.JSONObject

class UpdateProfile(user: Rider): SocketRequest() {
    init {
        val obj = JSONObject(Adapters.moshi.adapter<Rider>(Rider::class.java).toJson(user))
        this.params = arrayOf(obj)
    }
}