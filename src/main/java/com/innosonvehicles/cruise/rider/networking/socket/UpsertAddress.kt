package com.innosonvehicles.cruise.rider.networking.socket

import com.innosonvehicles.cruise.common.models.Address
import com.innosonvehicles.cruise.common.networking.socket.interfaces.SocketRequest
import com.innosonvehicles.cruise.common.utils.Adapters
import org.json.JSONObject

class UpsertAddress(address: Address): SocketRequest() {
    init {
        val add = JSONObject(Adapters.moshi.adapter<Address>(Address::class.java).toJson(address))
        this.params = arrayOf(add)
    }
}