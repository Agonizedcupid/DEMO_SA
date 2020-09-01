package com.innosonvehicles.cruise.rider.networking.socket

import com.innosonvehicles.cruise.common.networking.socket.interfaces.SocketRequest
import com.innosonvehicles.cruise.common.utils.Adapters
import com.innosonvehicles.cruise.rider.models.RequestDTO
import org.json.JSONObject

class RequestService(requestDto: RequestDTO): SocketRequest() {
    init {
        val dto = JSONObject(Adapters.moshi.adapter<RequestDTO>(RequestDTO::class.java).toJson(requestDto))
        this.params = arrayOf(dto)
    }
}


