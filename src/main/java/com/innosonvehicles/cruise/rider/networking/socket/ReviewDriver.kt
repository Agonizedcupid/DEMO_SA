package com.innosonvehicles.cruise.rider.networking.socket

import com.innosonvehicles.cruise.common.models.Review
import com.innosonvehicles.cruise.common.networking.socket.interfaces.SocketRequest
import com.innosonvehicles.cruise.common.utils.Adapters
import org.json.JSONObject

class ReviewDriver(review: Review): SocketRequest() {
    init {
        val obj = JSONObject(Adapters.moshi.adapter<Review>(Review::class.java).toJson(review))
        this.params = arrayOf(obj)
    }
}